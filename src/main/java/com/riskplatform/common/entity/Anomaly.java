package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.AnomalyType;
import com.riskplatform.common.enums.Severity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "anomalies")
public class Anomaly {
    @Id
    private String anomalyId;
    private String customerId;
    private String transactionId;
    private AnomalyType anomalyType;
    private Severity severity;
    private String description;
    private Instant detectedAt;
}
