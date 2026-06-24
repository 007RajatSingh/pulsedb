package com.rajat.pulsedb.model;

public class RaftState {
    private long currentTerm;
    private String votedFor;
    private String leaderId;
    private long commitIndex;
    private long lastApplied;

    public RaftState() {
    }

    public RaftState(long currentTerm, String votedFor, String leaderId, long commitIndex, long lastApplied) {
        this.currentTerm = currentTerm;
        this.votedFor = votedFor;
        this.leaderId = leaderId;
        this.commitIndex = commitIndex;
        this.lastApplied = lastApplied;
    }

    public long getCurrentTerm() {
        return currentTerm;
    }

    public void setCurrentTerm(long currentTerm) {
        this.currentTerm = currentTerm;
    }

    public String getVotedFor() {
        return votedFor;
    }

    public void setVotedFor(String votedFor) {
        this.votedFor = votedFor;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public long getCommitIndex() {
        return commitIndex;
    }

    public void setCommitIndex(long commitIndex) {
        this.commitIndex = commitIndex;
    }

    public long getLastApplied() {
        return lastApplied;
    }

    public void setLastApplied(long lastApplied) {
        this.lastApplied = lastApplied;
    }
}
