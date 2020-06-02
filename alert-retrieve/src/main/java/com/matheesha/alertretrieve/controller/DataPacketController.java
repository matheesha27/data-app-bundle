package com.matheesha.alertretrieve.controller;

import com.matheesha.alertretrieve.entity.DataPacket;
import com.matheesha.alertretrieve.service.DataPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/datapackets")
public class DataPacketController {

    private DataPacketService dataPacketService;

    @Autowired
    public DataPacketController(DataPacketService dataPacketService) {
        super();
        this.dataPacketService = dataPacketService;
    }

    @GetMapping("/all")
    public List<DataPacket> getAllPackets() {
        return this.dataPacketService.getAllPackets();
    }

    @GetMapping("/date")
    public List<DataPacket> getAllByDate(@RequestParam(name = "begin") long beginDate, @RequestParam(name = "end") long endDate) {
        return this.dataPacketService.getAllByDate(beginDate, endDate);
    }

    @GetMapping("/totalenergy")
    public List<DataPacket> getTotalEnergy(@RequestParam(name = "begin") long beginDate,
                                           @RequestParam(name = "end") long endDate,
                                           @RequestParam(name = "floor") long floor) {
        return this.dataPacketService.getTotalEnergy(beginDate, endDate, floor);
    }

    @GetMapping("/monthlyenergy")
    public List<DataPacket> getMonthlyEnergy(@RequestParam(name = "floor") long floor) {
        return dataPacketService.getMonthlyEnergy(floor);
    }
}
