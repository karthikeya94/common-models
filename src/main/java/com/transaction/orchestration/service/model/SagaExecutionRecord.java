package com.transaction.orchestration.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "saga_executions")
public class SagaExecutionRecord {
    @Id
    private String id;
    private String transactionId;
    private String customerId;
    private String sagaType;
    private SagaStatus status;
    private Decision finalDecision;
    private Date startedAt;
    private Date completedAt;
    private List<SagaStep> steps;
    private List<CompensationLog> compensations;
    private Integer version = 1;
}