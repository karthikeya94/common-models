package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.AlertStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudDetectionEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private Integer fraudConfidence;
    private String statusString;
    private AlertStatus status;
    private String alertId;
    private Instant timestamp;
    private Date legacyTimestamp;
    private String correlationId;
}
