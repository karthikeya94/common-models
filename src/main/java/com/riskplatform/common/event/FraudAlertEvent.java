package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.ActionType;
import com.riskplatform.common.enums.AlertStatus;
import com.riskplatform.common.entity.DetectionResult;
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
public class FraudAlertEvent {
    private String eventId;
    private String fraudAlertId;
    private String transactionId;
    private String customerId;
    private Integer overallFraudConfidence;
    private AlertStatus status;
    private ActionType recommendedAction;
    private List<DetectionResult> detectionTypes;
    private List<String> fraudFlags;
    private Instant timestamp;
    private String correlationId;
}
