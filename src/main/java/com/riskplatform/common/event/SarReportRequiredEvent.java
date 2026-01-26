package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SarReportRequiredEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private Integer sarScore;
    private List<String> sarTriggers;
    private Double amount;
    private String currency;
    private Instant timestamp;
    private LocalDateTime localTimestamp;
    private String reportDueDate;
    private String correlationId;
}
