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
public class SanctionsHitDetectedEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private String customerName;
    private List<SanctionsHit> hits;
    private Integer overallScore;
    private String action;
    private String caseId;
    private Instant timestamp;
    private LocalDateTime localTimestamp;
    private String correlationId;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SanctionsHit {
        private String database;
        private String sanctionedName;
        private String sanctionProgram;
        private Integer matchScore;
        private String matchType;
        private String severity;
    }
}
