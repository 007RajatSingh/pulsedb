package com.rajat.pulsedb.api;

public class WriteEventResponse {
    private String eventId;
    private boolean success;
    private String message;
    private String leaderNodeId;

    public WriteEventResponse() {
    }

    public WriteEventResponse(String eventId, boolean success, String message, String leaderNodeId) {
        this.eventId = eventId;
        this.success = success;
        this.message = message;
        this.leaderNodeId = leaderNodeId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLeaderNodeId() {
        return leaderNodeId;
    }

    public void setLeaderNodeId(String leaderNodeId) {
        this.leaderNodeId = leaderNodeId;
    }
}
