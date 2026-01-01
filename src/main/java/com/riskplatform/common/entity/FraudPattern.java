package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Document(collection = "fraud_patterns")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudPattern {

    @Id
    private String patternId;

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("type")
    private String type;

    @Field("frequency")
    private String frequency;

    @Field("avgConfidence")
    private Integer avgConfidence;

    @Field("affectedCustomers")
    private Integer affectedCustomers;

    @Field("trend")
    private String trend;

    @Field("firstDetected")
    private Instant firstDetected;

    @Field("lastDetected")
    private Instant lastDetected;

    @Field("severity")
    private String severity;

    @Field("riskScore")
    private Integer riskScore;

    @Field("falsePositiveRate")
    private Double falsePositiveRate;

    @Field("detectionTypes")
    private java.util.List<String> detectionTypes;

    @Field("mitigationActions")
    private java.util.List<String> mitigationActions;

    @Field("createdAt")
    private Instant createdAt;

    @Field("updatedAt")
    private Instant updatedAt;
}
