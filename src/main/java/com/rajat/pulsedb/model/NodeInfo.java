package com.rajat.pulsedb.model;

public class NodeInfo {
    private String nodeId;
    private String host;
    private int port;
    private NodeStatus status;
    private boolean leader;

    public NodeInfo() {
    }

    public NodeInfo(String nodeId, String host, int port, NodeStatus status, boolean leader) {
        this.nodeId = nodeId;
        this.host = host;
        this.port = port;
        this.status = status;
        this.leader = leader;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public NodeStatus getStatus() {
        return status;
    }

    public void setStatus(NodeStatus status) {
        this.status = status;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }
}
