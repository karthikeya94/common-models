package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.Decision;
import com.riskplatform.common.enums.SagaStatus;
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
public class OrchestrationEvent {
    private String eventId;
    private String sagaId;
    private String transactionId;
    private String customerId;
    private SagaStatus status;
    private Decision finalDecision;
    private String currentStep;
    private String reason;
    private Instant timestamp;
    private String correlationId;
}
