package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.Decision;
import com.riskplatform.common.enums.SagaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.List;

@Document(collection = "saga_executions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SagaExecutionRecord {

    @Id
    private String sagaId;

    @Field("transactionId")
    private String transactionId;

    @Field("customerId")
    private String customerId;

    @Field("sagaType")
    private String sagaType;

    @Field("status")
    private SagaStatus status;

    @Field("finalDecision")
    private Decision finalDecision;

    @Field("startedAt")
    private Instant startedAt;

    @Field("completedAt")
    private Instant completedAt;

    @Field("steps")
    private List<SagaStep> steps;

    @Field("compensations")
    private List<CompensationLog> compensations;

    @Field("version")
    private Long version;
}
