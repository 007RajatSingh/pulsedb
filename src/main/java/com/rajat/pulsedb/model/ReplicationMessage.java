package com.rajat.pulsedb.model;

public class ReplicationMessage {
    private String shardId;
    private String leaderNodeId;
    private Event event;
    private long logIndex;
    private long term;

    public ReplicationMessage() {
    }

    public ReplicationMessage(String shardId, String leaderNodeId, Event event, long logIndex, long term) {
        this.shardId = shardId;
        this.leaderNodeId = leaderNodeId;
        this.event = event;
        this.logIndex = logIndex;
        this.term = term;
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public String getLeaderNodeId() {
        return leaderNodeId;
    }

    public void setLeaderNodeId(String leaderNodeId) {
        this.leaderNodeId = leaderNodeId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
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
}
