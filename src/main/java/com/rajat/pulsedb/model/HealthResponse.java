package com.rajat.pulsedb.model;

public class HealthResponse {
    private String nodeId;
    private String status;
    private long uptimeMillis;
    private boolean leader;

    public HealthResponse() {
    }

    public HealthResponse(String nodeId, String status, long uptimeMillis, boolean leader) {
        this.nodeId = nodeId;
        this.status = status;
        this.uptimeMillis = uptimeMillis;
        this.leader = leader;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getUptimeMillis() {
        return uptimeMillis;
    }

    public void setUptimeMillis(long uptimeMillis) {
        this.uptimeMillis = uptimeMillis;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }
}
