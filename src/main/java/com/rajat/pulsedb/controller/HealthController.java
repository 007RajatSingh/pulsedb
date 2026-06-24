package com.rajat.pulsedb.controller;



import com.rajat.pulsedb.model.HealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final long startTime = System.currentTimeMillis();

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("node-1", "UP", System.currentTimeMillis() - startTime, false);
    }
}
