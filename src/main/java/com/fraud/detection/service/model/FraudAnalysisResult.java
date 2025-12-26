package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FraudAnalysisResult {
    private String transactionId;
    private String fraudAlertId;
    private Integer overallFraudConfidence;
    private String status;
    private String recommendedAction;
    private List<DetectionResult> detectionTypes;
    private List<String> fraudFlags;
    private CustomerRiskContext customerRiskContext;
    private RequiredAction requiredAction;

}