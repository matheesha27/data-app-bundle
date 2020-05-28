package com.matheesha.alertrabbitproducer.entity;

import java.util.Date;

public class Alert {
    private long id;
    private String eventName;
    private String serial;
    private String category;
    private double voltage;
    private Date updatedDate;

    public Alert() {
        super();
    }

    public Alert(long id, String eventName, String serial, String category, double voltage, Date updatedDate) {
        this.id = id;
        this.eventName = eventName;
        this.serial = serial;
        this.category = category;
        this.voltage = voltage;
        this.updatedDate = updatedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alert{");
        sb.append("id=").append(id);
        sb.append(", eventName='").append(eventName).append('\'');
        sb.append(", serial='").append(serial).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", voltage='").append(voltage).append('\'');
        sb.append(", updatedDate='").append(updatedDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
