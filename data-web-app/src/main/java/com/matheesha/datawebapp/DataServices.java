package com.matheesha.datawebapp;

import com.matheesha.datawebapp.entity.DataPacket;
import com.matheesha.datawebapp.entity.EventParameters;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DataServices {

    public List<DataPacket> getAllData() {
        EventParameters eventParameters1 = new EventParameters();
        eventParameters1.setName("TotalEnergyLatest"); eventParameters1.setType("STRING"); eventParameters1.setValue(2613.01);
        EventParameters eventParameters2 = new EventParameters();
        eventParameters2.setName("transactionId"); eventParameters2.setType("STRING"); eventParameters2.setValue(3519);
        EventParameters eventParameters3 = new EventParameters();
        eventParameters3.setName("monthEngKwh"); eventParameters3.setType("STRING"); eventParameters3.setValue(115.29);
        List<Object> eP1 = new ArrayList<>();
        eP1.add(eventParameters1); eP1.add(eventParameters2); eP1.add(eventParameters3);

        EventParameters eventParameters4 = new EventParameters();
        eventParameters4.setName("TotalEnergyLatest"); eventParameters4.setType("STRING"); eventParameters4.setValue(1254.52);
        EventParameters eventParameters5 = new EventParameters();
        eventParameters5.setName("transactionId"); eventParameters5.setType("STRING"); eventParameters5.setValue(2341);
        EventParameters eventParameters6 = new EventParameters();
        eventParameters6.setName("monthEngKwh"); eventParameters6.setType("STRING"); eventParameters6.setValue(251.6);
        List<Object> eP2 = new ArrayList<>();
        eP2.add(eventParameters4); eP2.add(eventParameters5); eP2.add(eventParameters6);

        EventParameters eventParameters7 = new EventParameters();
        eventParameters7.setName("TotalEnergyLatest"); eventParameters7.setType("STRING"); eventParameters7.setValue(2546.8);
        EventParameters eventParameters8 = new EventParameters();
        eventParameters8.setName("transactionId"); eventParameters8.setType("STRING"); eventParameters8.setValue(1256);
        EventParameters eventParameters9 = new EventParameters();
        eventParameters9.setName("monthEngKwh"); eventParameters9.setType("STRING"); eventParameters9.setValue(230.5);
        List<Object> eP3 = new ArrayList<>();
        eP3.add(eventParameters7); eP3.add(eventParameters8); eP3.add(eventParameters9);


        DataPacket dp1 = new DataPacket();
        dp1.setId(1); dp1.setDeviceDefinitionId(2); dp1.setEventName("dataPacket"); dp1.setEventParameters(eP1); dp1.setDate(DateUtils.createDateFromDateString("2020-05-02"));
        DataPacket dp2 = new DataPacket();
        dp2.setId(2); dp2.setDeviceDefinitionId(2); dp2.setEventName("dataPacket"); dp2.setEventParameters(eP2); dp2.setDate(DateUtils.createDateFromDateString("2020-05-03"));
        DataPacket dp3 = new DataPacket();
        dp3.setId(3); dp3.setDeviceDefinitionId(2); dp3.setEventName("dataPacket"); dp3.setEventParameters(eP3); dp3.setDate(DateUtils.createDateFromDateString("2020-05-06"));
        DataPacket dp4 = new DataPacket();
        dp4.setId(4); dp4.setDeviceDefinitionId(2); dp4.setEventName("dataPacket"); dp4.setEventParameters(eP2); dp4.setDate(DateUtils.createDateFromDateString("2020-05-10"));
        DataPacket dp5 = new DataPacket();
        dp5.setId(5); dp5.setDeviceDefinitionId(2); dp5.setEventName("dataPacket"); dp5.setEventParameters(eP1); dp5.setDate(DateUtils.createDateFromDateString("2020-05-05"));
        DataPacket dp6 = new DataPacket();
        dp6.setId(6); dp6.setDeviceDefinitionId(2); dp6.setEventName("dataPacket"); dp6.setEventParameters(eP2); dp6.setDate(DateUtils.createDateFromDateString("2020-05-07"));
        DataPacket dp7 = new DataPacket();
        dp7.setId(7); dp7.setDeviceDefinitionId(2); dp7.setEventName("dataPacket"); dp7.setEventParameters(eP3); dp7.setDate(DateUtils.createDateFromDateString("2020-05-05"));
        DataPacket dp8 = new DataPacket();
        dp8.setId(8); dp8.setDeviceDefinitionId(2); dp8.setEventName("dataPacket"); dp8.setEventParameters(eP1); dp8.setDate(DateUtils.createDateFromDateString("2020-05-08"));
        DataPacket dp9 = new DataPacket();
        dp9.setId(9); dp9.setDeviceDefinitionId(2); dp9.setEventName("dataPacket"); dp9.setEventParameters(eP3); dp9.setDate(DateUtils.createDateFromDateString("2020-05-07"));
        DataPacket dp10 = new DataPacket();
        dp10.setId(10); dp10.setDeviceDefinitionId(2); dp10.setEventName("dataPacket"); dp10.setEventParameters(eP2); dp10.setDate(DateUtils.createDateFromDateString("2020-05-04"));

        List<DataPacket> dataPackets = new ArrayList<>();
        dataPackets.add(dp1); dataPackets.add(dp2); dataPackets.add(dp3); dataPackets.add(dp4); dataPackets.add(dp5);
        dataPackets.add(dp6); dataPackets.add(dp7); dataPackets.add(dp8); dataPackets.add(dp9); dataPackets.add(dp10);

        return dataPackets;
    }
}
