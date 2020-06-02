package com.matheesha.alertrabbitconsumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.matheesha.alertrabbitconsumer.entity.Alert;
import com.matheesha.alertrabbitconsumer.entity.DataPacket;
import com.matheesha.alertrabbitconsumer.entity.MeterData;
import com.matheesha.alertrabbitconsumer.repository.AlertRepository;
import com.matheesha.alertrabbitconsumer.repository.DataPacketRepository;
import com.matheesha.alertrabbitconsumer.repository.MeterDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataProcessor {
    private final ObjectMapper objectMapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(DataProcessor.class);

    private static final String DEVICE_DEF_ID = "$.deviceDefinitionId";
    private static final String EVENT_NAME = "$.eventName";
    private static final int METER_DEVICE_DEF_ID = 1;
    private static final int NMD_DEVICE_DEF_ID = 2;

    @Autowired
    public DataProcessor(ObjectMapper objectMapper) {
        super();
        this.objectMapper = objectMapper;
    }

    @Autowired
    private AlertRepository alertRepository;
    @Autowired
    private MeterDataRepository meterDataRepository;
    @Autowired
    private DataPacketRepository dataPacketRepository;

    public void receiveMessage(String dataString) {
        LOGGER.info("Message Received: {}", dataString);
        try {
            if (JsonPath.read(dataString, DEVICE_DEF_ID).equals(METER_DEVICE_DEF_ID)) {
                if (JsonPath.read(dataString, EVENT_NAME).equals("alert")) {
                    Alert alert = this.objectMapper.readValue(dataString, Alert.class);
                    alertRepository.save(alert);
                }

            } else if (JsonPath.read(dataString, DEVICE_DEF_ID).equals(NMD_DEVICE_DEF_ID)) {
                if (JsonPath.read(dataString, EVENT_NAME).equals("meterData")) {
                    MeterData meterData = this.objectMapper.readValue(dataString, MeterData.class);
                    meterDataRepository.save(meterData);
                } else if (JsonPath.read(dataString, EVENT_NAME).equals("dataPacket")) {
                    DataPacket dataPacket = this.objectMapper.readValue(dataString, DataPacket.class);
                    dataPacketRepository.save(dataPacket);
                }

            } else {
                LOGGER.info("Other object type found");
            }
        } catch (JsonProcessingException e) {
            LOGGER.error("JSON Processing Exception caught", e);
        }
    }
}













