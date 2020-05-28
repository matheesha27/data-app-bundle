package com.matheesha.alertrabbitconsumer.entity;

public class EventParameters {
    private String name;
    private String type;
    private long value;

    public EventParameters() {
        super();
    }

    public EventParameters(String name, String type, long value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
