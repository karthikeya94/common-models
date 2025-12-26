package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskFactors {
    private Integer transactionRisk;
    private Integer behaviorRisk;
    private Integer velocityRisk;
    private Integer geographicRisk;
    private Integer merchantRisk;
}
