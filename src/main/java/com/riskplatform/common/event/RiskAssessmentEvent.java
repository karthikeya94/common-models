package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.Decision;
import com.riskplatform.common.enums.RiskLevel;
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
public class RiskAssessmentEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private Integer riskScore;
    private String riskLevelString;
    private RiskLevel riskLevel;
    private String decisionString;
    private Decision decision;
    private Instant timestamp;
    private Date legacyTimestamp;
    private String correlationId;
}
