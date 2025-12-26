package com.compliance.regulatory.service.model.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "audit_trails")
public class AuditTrail {
    
    @Id
    private String id;
    
    private String transactionId;
    private String customerId;
    private List<AuditLogEntry> auditLog;
    private String overallComplianceStatus;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdated;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AuditLogEntry {
        private LocalDateTime timestamp;
        private String action;
        private String status;
        private String performedBy;
        private Object details;
    }
}