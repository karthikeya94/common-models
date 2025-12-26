package com.transaction.orchestration.service.model;

public enum Action {
    ALLOW_TRANSACTION,
    QUEUE_FOR_MANUAL_REVIEW,
    BLOCK_AND_ESCALATE
}