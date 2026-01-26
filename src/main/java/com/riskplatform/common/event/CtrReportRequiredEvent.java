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
public class CtrReportRequiredEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private Double amount;
    private String currency;
    private Double thresholdExceeded;
    private Instant timestamp;
    private LocalDateTime localTimestamp;
    private String reportDueDate;
    private String correlationId;
}
