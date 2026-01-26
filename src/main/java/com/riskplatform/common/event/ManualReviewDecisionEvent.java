package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class ManualReviewDecisionEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private String decision;
    private String notes;
    private String reviewedBy;
    private Instant timestamp;
    private Date legacyTimestamp;
    private String correlationId;
}
