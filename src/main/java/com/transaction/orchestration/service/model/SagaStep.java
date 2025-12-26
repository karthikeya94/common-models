package com.transaction.orchestration.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SagaStep {
    private Integer stepSequence;
    private String stepName;
    private SagaStepStatus status;
    private Date startedAt;
    private Date completedAt;
    private Long timeout;
    private Object result;
    private String errorMessage;
}