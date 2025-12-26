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
import java.util.List;

@Document(collection = "audit_logs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditTrail {

    @Id
    private String id;

    @Field("transactionId")
    private String transactionId;

    @Field("customerId")
    private String customerId;

    @Field("auditLog")
    private List<AuditLogEntry> auditLog;

    @Field("overallComplianceStatus")
    private String overallComplianceStatus;

    @Field("lastUpdated")
    private Instant lastUpdated;
}
