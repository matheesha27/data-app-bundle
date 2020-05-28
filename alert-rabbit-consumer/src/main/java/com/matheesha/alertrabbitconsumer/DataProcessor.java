package com.matheesha.alertrabbitconsumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matheesha.alertrabbitconsumer.entity.Alert;
import com.matheesha.alertrabbitconsumer.entity.MeterData;
import com.matheesha.alertrabbitconsumer.repository.AlertRepository;
import com.matheesha.alertrabbitconsumer.repository.MeterDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.json.*;

@Component
public class DataProcessor {
    private final ObjectMapper objectMapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(DataProcessor.class);

    @Autowired
    public DataProcessor(ObjectMapper objectMapper) {
        super();
        this.objectMapper = objectMapper;
    }

    @Autowired
    private AlertRepository alertRepository;
    @Autowired
    private MeterDataRepository meterDataRepository;

    public void receiveMessage(String dataString) {
        LOGGER.info("Message Received: {}", dataString);
        try {
            JSONObject object = new JSONObject(dataString);
            if (object.getString("eventName").equals("alert")) {
                Alert alert = this.objectMapper.readValue(dataString, Alert.class);
                alertRepository.save(alert);
            } else if (object.getString("eventName").equals("meterData")) {
                MeterData meterData = this.objectMapper.readValue(dataString, MeterData.class);
                meterDataRepository.save(meterData);
            } else {
                LOGGER.info("Other object type found");
            }
        } catch (JSONException e) {
            LOGGER.error("JSON Exception caught", e);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}













