package com.rajat.pulsedb.model;

import java.util.List;
import java.util.Map;

public class ClusterMetadata {
    private String clusterId;
    private Map<String, NodeInfo> nodes;
    private Map<String, String> shardToLeaderNode;
    private Map<String, List<String>> shardToReplicaNodes;

    public ClusterMetadata() {
    }

    public ClusterMetadata(String clusterId, Map<String, NodeInfo> nodes,
                           Map<String, String> shardToLeaderNode,
                           Map<String, List<String>> shardToReplicaNodes) {
        this.clusterId = clusterId;
        this.nodes = nodes;
        this.shardToLeaderNode = shardToLeaderNode;
        this.shardToReplicaNodes = shardToReplicaNodes;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Map<String, NodeInfo> getNodes() {
        return nodes;
    }

    public void setNodes(Map<String, NodeInfo> nodes) {
        this.nodes = nodes;
    }

    public Map<String, String> getShardToLeaderNode() {
        return shardToLeaderNode;
    }

    public void setShardToLeaderNode(Map<String, String> shardToLeaderNode) {
        this.shardToLeaderNode = shardToLeaderNode;
    }

    public Map<String, List<String>> getShardToReplicaNodes() {
        return shardToReplicaNodes;
    }

    public void setShardToReplicaNodes(Map<String, List<String>> shardToReplicaNodes) {
        this.shardToReplicaNodes = shardToReplicaNodes;
    }
}
