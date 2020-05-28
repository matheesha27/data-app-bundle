package com.matheesha.datawebapp;

import com.matheesha.datawebapp.entity.Alert;
import com.matheesha.datawebapp.entity.MeterData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DataServices {
    private static List<Object> alerts = new ArrayList<>(Arrays.asList(
            new Alert(1, "alert", "N123", "Category 2", 250, DateUtils.createDateFromDateString("2020-05-01")),
            new Alert(2, "alert", "N124", "Category 3", 320, DateUtils.createDateFromDateString("2020-05-05")),
            new Alert(3, "alert", "N125", "Category 1", 205, DateUtils.createDateFromDateString("2020-05-03")),
            new Alert(4, "alert", "N126", "Category 1", 220, DateUtils.createDateFromDateString("2020-05-13")),
            new Alert(5, "alert", "N127", "Category 3", 260, DateUtils.createDateFromDateString("2020-05-02")),
            new Alert(6, "alert", "N128", "Category 2", 250, DateUtils.createDateFromDateString("2020-05-08")),
            new Alert(7, "alert", "N129", "Category 3", 275, DateUtils.createDateFromDateString("2020-05-04")),
            new Alert(8, "alert", "N130", "Category 1", 210, DateUtils.createDateFromDateString("2020-05-14")),
            new Alert(9, "alert", "N131", "Category 2", 215, DateUtils.createDateFromDateString("2020-05-07")),
            new Alert(10, "alert", "N132", "Category 3", 260, DateUtils.createDateFromDateString("2020-05-06")),
            new Alert(11, "alert", "N523", "Category 2", 250, DateUtils.createDateFromDateString("2020-05-11")),
            new Alert(12, "alert", "N164", "Category 3", 310, DateUtils.createDateFromDateString("2020-05-15")),
            new Alert(13, "alert", "N325", "Category 1", 205, DateUtils.createDateFromDateString("2020-05-18")),
            new Alert(14, "alert", "N826", "Category 2", 220, DateUtils.createDateFromDateString("2020-05-10")),
            new Alert(15, "alert", "N327", "Category 3", 180, DateUtils.createDateFromDateString("2020-05-17")),
            new Alert(16, "alert", "N328", "Category 2", 250, DateUtils.createDateFromDateString("2020-05-09")),
            new Alert(17, "alert", "N1029", "Category 3", 240, DateUtils.createDateFromDateString("2020-05-16")),
            new Alert(18, "alert", "N430", "Category 3", 260, DateUtils.createDateFromDateString("2020-05-19")),
            new Alert(19, "alert", "N531", "Category 2", 215, DateUtils.createDateFromDateString("2020-05-20")),
            new Alert(20, "alert", "N532", "Category 2", 260, DateUtils.createDateFromDateString("2020-05-12"))
    ));

    private static List<Object> meterData = new ArrayList<>(Arrays.asList(
            new MeterData(1, "meterData", "123456", 253, true),
            new MeterData(2, "meterData", "123457", 186.4, false),
            new MeterData(3, "meterData", "123458", 220.5, true)
    ));

    public List<Object> getAllData() {
        List<Object> data = new ArrayList<Object>();
        data.addAll(alerts);
        data.addAll(meterData);
        return data;
    }
}
