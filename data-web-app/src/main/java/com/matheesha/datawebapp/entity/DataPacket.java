package com.matheesha.datawebapp.entity;


import java.util.Date;
import java.util.List;

public class DataPacket {
    private long id;
    private long deviceDefinitionId;
    private String eventName;
    private List eventParameters;
    private Date date;

    public DataPacket() {
        super();
    }

    public DataPacket(long id, long deviceDefinitionId, String eventName, List eventParameters, Date date) {
        this.id = id;
        this.deviceDefinitionId = deviceDefinitionId;
        this.eventName = eventName;
        this.eventParameters = eventParameters;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDeviceDefinitionId() {
        return deviceDefinitionId;
    }

    public void setDeviceDefinitionId(long deviceDefinitionId) {
        this.deviceDefinitionId = deviceDefinitionId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List getEventParameters() {
        return eventParameters;
    }

    public void setEventParameters(List eventParameters) {
        this.eventParameters = eventParameters;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataPacket{");
        sb.append("id=").append(id);
        sb.append(", deviceDefinitionId='").append(deviceDefinitionId).append('\'');
        sb.append(", eventName='").append(eventName).append('\'');
        sb.append(", eventParameters='").append(eventParameters).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
