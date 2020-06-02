package com.matheesha.alertretrieve.controller;

import com.matheesha.alertretrieve.service.AlertServices;
import com.matheesha.alertretrieve.DateUtils;
import com.matheesha.alertretrieve.entity.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertRetrieveController {

    private AlertServices alertServices;

    @Autowired
    public AlertRetrieveController(AlertServices alertServices) {
        super();
        this.alertServices = alertServices;
    }

    @GetMapping("/all")
    public List<Alert> getAllAlerts() {
        return this.alertServices.getAllAlerts();
    }

    @GetMapping("/{id}")
    public List<Alert> getIdLessThan(@PathVariable(name = "id") int id) {
        return this.alertServices.getById(id);
    }

    @GetMapping("/voltage")
    public List<Alert> getVoltageInRange(@RequestParam(name = "min") double min, @RequestParam(name = "max") double max) {
        return this.alertServices.getVoltageInRange(min, max);
    }

    @GetMapping("/category")
    public List<Alert> getVoltageInRange(@RequestParam(name = "type") int type) {
        return this.alertServices.getCategory(type);
    }

    @GetMapping("/dates")
    public List<Alert> getByUpdatedDateBetween(String begin, String end) {
        Date beginDate = DateUtils.createDateFromDateString(begin);
        Date endDate = DateUtils.createDateFromDateString(end);
        return this.alertServices.findByUpdatedDate(beginDate, endDate);
    }
}
