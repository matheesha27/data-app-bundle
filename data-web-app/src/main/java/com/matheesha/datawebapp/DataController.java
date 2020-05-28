package com.matheesha.datawebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    private DataServices dataServices;

    @Autowired
    public DataController(DataServices dataServices) {
        super();
        this.dataServices = dataServices;
    }

    @GetMapping
    public List<?> getAlerts() {
        return this.dataServices.getAllData();
    }
}
