package com.matheesha.alertrabbitconsumer.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Meter_Data_filtered_2")
public class MeterData {
    @Id
    private long id;
    @Field("devDefId")
    private long deviceDefinitionId;
    @Field("event")
    private String eventName;
    @Field("ser")
    private String serial;
    @Field("energy")
    private double energyConsumption;
    @Field("mode")
    private boolean isPostpaid;

    public MeterData() {
        super();
    }

    public MeterData(long id, long deviceDefinitionId, String eventName, String serial, double energyConsumption, boolean isPostpaid) {
        this.id = id;
        this.deviceDefinitionId = deviceDefinitionId;
        this.eventName = eventName;
        this.serial = serial;
        this.energyConsumption = energyConsumption;
        this.isPostpaid = isPostpaid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public boolean isPostpaid() {
        return isPostpaid;
    }

    public void setPostpaid(boolean postpaid) {
        isPostpaid = postpaid;
    }

    public long getDeviceDefinitionId() {
        return deviceDefinitionId;
    }

    public void setDeviceDefinitionId(long deviceDefinitionId) {
        this.deviceDefinitionId = deviceDefinitionId;
    }
}
