package com.rajat.pulsedb.model;

public class LogEntry {
    private long logIndex;
    private long term;
    private Event event;
    private long createdAt;
    private String operationType;

    public LogEntry() {
    }

    public LogEntry(long logIndex, long term, Event event, long createdAt, String operationType) {
        this.logIndex = logIndex;
        this.term = term;
        this.event = event;
        this.createdAt = createdAt;
        this.operationType = operationType;
    }

    public long getLogIndex() {
        return logIndex;
    }

    public void setLogIndex(long logIndex) {
        this.logIndex = logIndex;
    }

    public long getTerm() {
        return term;
    }

    public void setTerm(long term) {
        this.term = term;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}
