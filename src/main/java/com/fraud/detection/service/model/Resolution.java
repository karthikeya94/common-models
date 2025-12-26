package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Resolution {
    private String action;
    private String reason;
    private String resolvedBy;
    private Instant resolvedAt;

}