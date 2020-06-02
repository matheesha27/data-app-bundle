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

    public List<DataPacket> getAllByDate(long beginDate, long endDate) {
        List<DataPacket> dataByDateList = new ArrayList<>();
        this.dataPacketRepository.getAllByDate(beginDate, endDate).forEach(dataByDateList::add);
        return dataByDateList;
    }

    public List<DataPacket> getTotalEnergy(long beginDate, long endDate, long floor) {
        List<DataPacket> totalEnergyList = new ArrayList<>();
        this.dataPacketRepository.getTotalEnergy(beginDate, endDate, floor).forEach(totalEnergyList::add);
        return totalEnergyList;
    }

    public List<DataPacket> getMonthlyEnergy(long floor) {
        List<DataPacket> monthlyEnergyList = new ArrayList<>();
        this.dataPacketRepository.getMonthlyEnergy(floor).forEach(monthlyEnergyList::add);
        return monthlyEnergyList;
    }

}
