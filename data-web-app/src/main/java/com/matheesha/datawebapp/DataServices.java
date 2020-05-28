package com.matheesha.datawebapp;

import com.matheesha.datawebapp.entity.Alert;
import com.matheesha.datawebapp.entity.DataPacket;
import com.matheesha.datawebapp.entity.EventParameters;
import com.matheesha.datawebapp.entity.MeterData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DataServices {
    // NMD: 1
    // Meter: 2
    // Transformer: 3
    private static List<Object> alerts = new ArrayList<>(Arrays.asList(
            new Alert(1, 1, "alert", "N123", "Category 2", 250, DateUtils.createDateFromDateString("2020-05-01")),
            new Alert(2, 1, "alert", "N124", "Category 3", 300, DateUtils.createDateFromDateString("2020-05-05")),
            new Alert(3, 1, "alert", "N125", "Category 1", 205, DateUtils.createDateFromDateString("2020-05-03")),
            new Alert(4, 1, "alert", "N126", "Category 1", 220, DateUtils.createDateFromDateString("2020-05-13")),
            new Alert(5, 1, "alert", "N127", "Category 3", 260, DateUtils.createDateFromDateString("2020-05-02")),
            new Alert(6, 1, "alert", "N128", "Category 2", 250, DateUtils.createDateFromDateString("2020-05-08")),
            new Alert(7, 1, "alert", "N129", "Category 3", 275, DateUtils.createDateFromDateString("2020-05-04")),
            new Alert(8, 1, "alert", "N130", "Category 1", 210, DateUtils.createDateFromDateString("2020-05-14")),
            new Alert(9, 1, "alert", "N131", "Category 2", 215, DateUtils.createDateFromDateString("2020-05-07")),
            new Alert(10, 1, "alert", "N132", "Category 3", 260, DateUtils.createDateFromDateString("2020-05-06")),
            new Alert(11, 1, "alert", "N523", "Category 2", 250, DateUtils.createDateFromDateString("2020-05-11")),
            new Alert(12, 1, "alert", "N164", "Category 3", 310, DateUtils.createDateFromDateString("2020-05-15")),
            new Alert(13, 1, "alert", "N325", "Category 1", 205, DateUtils.createDateFromDateString("2020-05-18")),
            new Alert(14, 1, "alert", "N826", "Category 2", 220, DateUtils.createDateFromDateString("2020-05-10")),
            new Alert(15, 1, "alert", "N327", "Category 3", 180, DateUtils.createDateFromDateString("2020-05-17")),
            new Alert(16, 1, "alert", "N328", "Category 2", 250, DateUtils.createDateFromDateString("2020-05-09")),
            new Alert(17, 1, "alert", "N1029", "Category 3", 240, DateUtils.createDateFromDateString("2020-05-16")),
            new Alert(18, 1, "alert", "N430", "Category 3", 260, DateUtils.createDateFromDateString("2020-05-19")),
            new Alert(19, 1, "alert", "N531", "Category 2", 215, DateUtils.createDateFromDateString("2020-05-20")),
            new Alert(20, 1, "alert", "N532", "Category 2", 260, DateUtils.createDateFromDateString("2020-05-12"))
    ));

    private static List<Object> meterData = new ArrayList<>(Arrays.asList(
            new MeterData(1, 2, "meterData", "123456", 253, true),
            new MeterData(2, 2, "meterData", "123457", 186.4, false),
            new MeterData(3, 2, "meterData", "123458", 220.5, true)
    ));

    /*
    private static EventParameters[] eventParameters1 = new ArrayList<>(Arrays.asList(
            new EventParameters("kWh", "default", 219),
            new EventParameters("kWh", "default", 215)
            ));
    */
    private static List<Object> dataPackets = new ArrayList<>(Arrays.asList(
            new DataPacket(1, 2, "dataPacket", new EventParameters("kWh", "default", 219), "default"),
            new DataPacket(2, 2, "dataPacket", new EventParameters("kWh", "default", 230), "default")
    ));

    public List<Object> getAllData() {
        List<Object> data = new ArrayList<Object>();
        data.addAll(alerts);
        data.addAll(meterData);
        data.addAll(dataPackets);
        return data;
    }
}
