package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KycVerificationRequiredEvent {
    private String eventId;
    private String customerId;
    private String transactionId;
    private String requiredKycLevel;
    private Double transactionAmount;
    private String currency;
    private String reason;
    private String deadline;
    private Instant timestamp;
    private LocalDateTime localTimestamp;
    private String correlationId;
}
