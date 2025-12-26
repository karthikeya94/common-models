package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class ValidationDetails {
    private String structuralCheck;
    private String businessCheck;
    private String kycStatus;
    private Boolean velocityFlag;
    private String sanctionsCheck;
    private Instant validatedAt;
}
