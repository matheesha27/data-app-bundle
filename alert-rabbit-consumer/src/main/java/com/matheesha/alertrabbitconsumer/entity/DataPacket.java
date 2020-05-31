package com.matheesha.alertrabbitconsumer.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "Data_Packets_filtered_2")
public class DataPacket {
    @Id
    private long id;
    @Field("devDefId")
    private long deviceDefinitionId;
    @Field("event")
    private String eventName;
    @Field("evtParam")
    private List eventParameters;
    @Field("date")
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
}
