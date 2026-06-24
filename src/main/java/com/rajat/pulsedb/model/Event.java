package com.rajat.pulsedb.model;

public class Event {
    private String eventId;
    private String tenantId;
    private String streamId;
    private long timestamp;
    private String eventType;
    private String payload;
    private long version;

    public Event() {
    }

    public Event(String eventId, String tenantId, String streamId, long timestamp,
                 String eventType, String payload, long version) {
        this.eventId = eventId;
        this.tenantId = tenantId;
        this.streamId = streamId;
        this.timestamp = timestamp;
        this.eventType = eventType;
        this.payload = payload;
        this.version = version;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
