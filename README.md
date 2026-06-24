# PulseDB

PulseDB is a distributed event store for storing tenant-scoped events with sharding, replication, quorum consistency, and crash recovery.

## Stack
- Java 21
- Spring Boot 3.4.2
- Maven

## Features
- Tenant-scoped event storage
- Append-only log
- In-memory indexing engine
- Sharding
- Leader-follower replication
- QUORUM consistency
- Crash recovery

## Run
```bash
mvn spring-boot:run