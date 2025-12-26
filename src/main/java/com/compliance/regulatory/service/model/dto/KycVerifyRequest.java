package com.compliance.regulatory.service.model.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KycVerifyRequest {
    private String customerId;
    private String kycLevel;
    private List<DocumentInfo> documents;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DocumentInfo {
        private String type;
        private String fileId;
        private String verificationStatus;
    }
}