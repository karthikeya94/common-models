package com.compliance.regulatory.service.model.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditTrailResponse {
    private String transactionId;
    private String customerId;
    private List<AuditEntry> auditTrail;
    private String overallComplianceStatus;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AuditEntry {
        private LocalDateTime timestamp;
        private String action;
        private String status;
        private Object details;
    }
}