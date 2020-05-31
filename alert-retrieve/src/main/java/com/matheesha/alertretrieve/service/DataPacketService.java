package com.matheesha.alertretrieve.service;

import com.matheesha.alertretrieve.entity.DataPacket;
import com.matheesha.alertretrieve.repository.DataPacketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataPacketService {

    private DataPacketRepository dataPacketRepository;

    @Autowired
    public DataPacketService(DataPacketRepository dataPacketRepository) {
        super();
        this.dataPacketRepository = dataPacketRepository;
    }

    public List<DataPacket> getAllPackets() {
        List<DataPacket> dataPacketList = new ArrayList<>();
        this.dataPacketRepository.findAll().forEach(dataPacketList::add);
        return dataPacketList;
    }

}
