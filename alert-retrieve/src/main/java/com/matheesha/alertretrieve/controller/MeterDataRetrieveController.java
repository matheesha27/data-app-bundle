package com.matheesha.alertretrieve.controller;

import com.matheesha.alertretrieve.entity.MeterData;
import com.matheesha.alertretrieve.service.MeterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meterdata")
public class MeterDataRetrieveController {

    private MeterDataService meterDataService;

    @Autowired
    public MeterDataRetrieveController(MeterDataService meterDataService) {
        super();
        this.meterDataService = meterDataService;
    }

    @GetMapping("/all")
    public List<MeterData> getAllMeterData() {
        return this.meterDataService.getAllMeterData();
    }

}
