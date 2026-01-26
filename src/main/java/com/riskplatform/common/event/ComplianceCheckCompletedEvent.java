package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.AmlStatus;
import com.riskplatform.common.enums.KycStatus;
import com.riskplatform.common.enums.SanctionsStatus;
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
public class ComplianceCheckCompletedEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private String complianceStatus;
    private String amlStatusString;
    private AmlStatus amlStatus;
    private String kycStatusString;
    private KycStatus kycStatus;
    private String sanctionsStatusString;
    private SanctionsStatus sanctionsStatus;
    private Boolean reportingRequired;
    private String reportType;
    private Instant timestamp;
    private LocalDateTime localTimestamp;
    private String correlationId;
}
