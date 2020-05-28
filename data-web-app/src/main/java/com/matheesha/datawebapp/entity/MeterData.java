package com.matheesha.datawebapp.entity;

public class MeterData {
    private long id;
    private long deviceDefinitionId;
    private String eventName;
    private String serial;
    private double energyConsumption;
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
