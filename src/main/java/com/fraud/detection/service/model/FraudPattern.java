package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.Instant;
import java.util.List;

@Document(collection = "fraud_patterns")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FraudPattern {

    @Id
    private String id;

    @Field("patternId")
    private String patternId;

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("type")
    private String type;

    @Field("detectionAlgorithm")
    private String detectionAlgorithm;

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

    @Field("relatedAlerts")
    private List<String> relatedAlerts;

    @Field("severity")
    private String severity;

    @Field("riskScore")
    private Integer riskScore;

    @Field("mitigationActions")
    private List<String> mitigationActions;

    @Field("falsePositiveRate")
    private Double falsePositiveRate;

    @Field("detectionTypes")
    private List<String> detectionTypes;

}