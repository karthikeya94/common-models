package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.SagaStepStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SagaStep {
    private Integer stepSequence;
    private String stepName;
    private SagaStepStatus status;
    private Instant startedAt;
    private Instant completedAt;
    private Long timeout;
    private Map<String, Object> result;
    private String compensation;
}
