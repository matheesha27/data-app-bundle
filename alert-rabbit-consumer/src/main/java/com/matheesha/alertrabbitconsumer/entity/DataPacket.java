package com.matheesha.alertrabbitconsumer.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Data_Packets_filtered")
public class DataPacket {
    @Id
    private long id;
    @Field("devDefId")
    private long deviceDefinitionId;
    @Field("event")
    private String eventName;
    @Field("evtParam")
    private EventParameters eventParameters;
    @Field("type")
    private String type;

    public DataPacket() {
        super();
    }

    public DataPacket(long id, long deviceDefinitionId, String eventName, EventParameters eventParameters, String type) {
        this.id = id;
        this.deviceDefinitionId = deviceDefinitionId;
        this.eventName = eventName;
        this.eventParameters = eventParameters;
        this.type = type;
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

    public EventParameters getEventParameters() {
        return eventParameters;
    }

    public void setEventParameters(EventParameters eventParameters) {
        this.eventParameters = eventParameters;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
