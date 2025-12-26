package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.Decision;
import com.riskplatform.common.enums.RiskLevel;
import com.riskplatform.common.enums.Severity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskAssessment {
    private String transactionId;
    private Integer riskScore;
    private RiskLevel riskLevel;
    private Decision decision;
    private DecisionDetails decisionDetails;
    private RiskFactors riskFactors;
    private List<RiskFlag> riskFlags;
    private Instant timestamp;
}
