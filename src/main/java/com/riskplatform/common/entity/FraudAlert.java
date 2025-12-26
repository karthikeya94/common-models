package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.AlertStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.List;

@Document(collection = "fraud_alerts")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FraudAlert {

    @Id
    private String fraudAlertId;

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
