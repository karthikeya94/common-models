package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.SanctionsStatus;
import com.riskplatform.common.enums.Severity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SanctionsHit {
    private String database;
    private SanctionsStatus matchType;
    private Integer matchScore;
    private String sanctionedName;
    private String sanctionProgram;
    private Severity severity;
}
