package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.AlertStatus;
import com.riskplatform.common.enums.FraudType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetectionResult {
    private FraudType type;
    private Integer confidence;
    private AlertStatus status;
    private String reason;
    private Map<String, Object> details;
}
