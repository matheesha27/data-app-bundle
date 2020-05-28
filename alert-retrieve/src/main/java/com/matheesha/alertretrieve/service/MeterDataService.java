package com.matheesha.alertretrieve.service;

import com.matheesha.alertretrieve.entity.MeterData;
import com.matheesha.alertretrieve.repository.MeterDataRetrieveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeterDataService {

    private MeterDataRetrieveRepository meterDataRepository;

    @Autowired
    public MeterDataService(MeterDataRetrieveRepository meterDataRepository) {
        super();
        this.meterDataRepository = meterDataRepository;
    }

    public List<MeterData> getAllMeterData() {
        List<MeterData> meterData = new ArrayList<>();
        this.meterDataRepository.findAll().forEach(meterData::add);
        return meterData;
    }
}
