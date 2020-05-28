package com.matheesha.datawebapp.entity;

public class DataPacket {
    private long id;
    private String eventName;
    private EventParameters eventParameters;
    private String type;

    public DataPacket() {
        super();
    }

    public DataPacket(long id, String eventName, EventParameters eventParameters, String type) {
        this.id = id;
        this.eventName = eventName;
        this.eventParameters = eventParameters;
        this.type = type;
    }


}
