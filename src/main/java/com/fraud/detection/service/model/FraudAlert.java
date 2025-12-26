package com.fraud.detection.service.model;

import com.fraud.detection.service.model.enums.AlertStatus;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.Instant;
import java.util.List;

@Document(collection = "fraud_alerts")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FraudAlert {

    @Id
    private String id;

    @Field("transactionId")
    private String transactionId;

    @Field("customerId")
    private String customerId;

    @Field("overallFraudConfidence")
    private Integer overallFraudConfidence;

    @Field("status")
    private AlertStatus status;

    @Field("detectionTypes")
    private List<DetectionResult> detectionTypes;

    @Field("fraudFlags")
    private List<String> fraudFlags;

    @Field("raisedAt")
    private Instant raisedAt;

    @Field("raisedBy")
    private String raisedBy;

    @Field("assignedTo")
    private String assignedTo;

    @Field("reviewedAt")
    private Instant reviewedAt;

    @Field("resolution")
    private Resolution resolution;

    @Field("createdAt")
    private Instant createdAt;

    @Field("updatedAt")
    private Instant updatedAt;

}