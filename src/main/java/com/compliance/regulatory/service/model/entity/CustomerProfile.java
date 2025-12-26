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
@Document(collection = "customer_profiles")
public class CustomerProfile {
    
    @Id
    private String id;
    
    private String kycStatus;
    private Integer kycLevel;
    private LocalDateTime kycExpiryDate;
    private LocalDateTime verificationDate;
    private LocalDateTime nextReviewDate;
    private String pepStatus;
    private String riskLevel;
    private String entityType;
    private List<DocumentInfo> documents;
    private Boolean blacklisted;
    private String blacklistReason;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DocumentInfo {
        private String type;
        private String fileId;
        private String verificationStatus;
        private LocalDateTime verifiedAt;
        private String verifiedBy;
    }
}