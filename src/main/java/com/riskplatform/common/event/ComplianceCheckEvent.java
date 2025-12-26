package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.AmlStatus;
import com.riskplatform.common.enums.KycStatus;
import com.riskplatform.common.enums.SanctionsStatus;
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
public class ComplianceCheckEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private AmlStatus amlStatus;
    private KycStatus kycStatus;
    private SanctionsStatus sanctionsStatus;
    private Boolean reportingRequired;
    private String reportType;
    private Instant timestamp;
    private String correlationId;
}
