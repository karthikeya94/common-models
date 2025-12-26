package com.transaction.orchestration.service.model;

public enum SagaStepStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED,
    FAILED,
    TIMEOUT,
    COMPENSATING,
    COMPENSATED
}