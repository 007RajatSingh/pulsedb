package com.rajat.pulsedb.api;

import jakarta.validation.constraints.NotBlank;
//DTO class for write event
public class WriteEventRequest {

    @NotBlank
    private String tenantId;

    @NotBlank
    private String streamId;

    @NotBlank
    private String eventType;

    @NotBlank
    private String payload;

    private Long timestamp;

    public WriteEventRequest() {
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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
