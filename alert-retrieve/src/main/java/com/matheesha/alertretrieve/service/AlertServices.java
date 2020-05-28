package com.matheesha.alertretrieve.service;

import com.matheesha.alertretrieve.entity.Alert;
import com.matheesha.alertretrieve.repository.AlertRetrieveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AlertServices {

    private AlertRetrieveRepository alertRetrieveRepository;

    @Autowired
    public AlertServices(AlertRetrieveRepository alertRetrieveRepository) {
        super();
        this.alertRetrieveRepository = alertRetrieveRepository;
    }

    public List<Alert> getAllAlerts() {
        List<Alert> alertList = new ArrayList<>();
        this.alertRetrieveRepository.findAll().forEach(alertList::add);
        return alertList;
    }

    public List<Alert> getById(long id) {
        List<Alert> alertIdList = new ArrayList<>();
        this.alertRetrieveRepository.findById(id).forEach(alertIdList::add);
        return alertIdList;
    }

    public List<Alert> getVoltageInRange(double minVoltage, double maxVoltage) {
        List<Alert> alertVoltageList = new ArrayList<>();
        this.alertRetrieveRepository.getVoltageInRange(minVoltage, maxVoltage).forEach(alertVoltageList::add);
        return alertVoltageList;
    }

    public List<Alert> getCategory(int categoryType) {
        List<Alert> alertCategoryList = new ArrayList<>();
        this.alertRetrieveRepository.getCategory(categoryType).forEach(alertCategoryList::add);
        return alertCategoryList;
    }

    public List<Alert> findByUpdatedDate(Date startDate, Date endDate) {
        List<Alert> alertUpdatedDateList = new ArrayList<>();
        this.alertRetrieveRepository.findByUpdatedDateBetween(startDate, endDate).forEach(alertUpdatedDateList::add);
        return alertUpdatedDateList;
    }
}
