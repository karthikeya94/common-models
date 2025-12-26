package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.Decision;
import com.riskplatform.common.enums.RiskLevel;
import com.riskplatform.common.entity.DecisionDetails;
import com.riskplatform.common.entity.RiskFactors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskScoreCalculatedEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private Integer previousScore;
    private Integer newScore;
    private RiskLevel riskLevel;
    private Decision decision;
    private DecisionDetails decisionDetails;
    private RiskFactors factors;
    private Long version;
    private Instant timestamp;
    private String correlationId;
}
