package com.rajat.pulsedb.model;

import java.util.Objects;

public class PartitionKey {
    private String tenantId;
    private String streamId;

    public PartitionKey() {
    }

    public PartitionKey(String tenantId, String streamId) {
        this.tenantId = tenantId;
        this.streamId = streamId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PartitionKey that)) return false;
        return Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(streamId, that.streamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, streamId);
    }
}
