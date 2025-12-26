package com.compliance.regulatory.service.model.dto;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KycVerifyResponse {
    private String customerId;
    private String kycStatus;
    private Integer kycLevel;
    private LocalDateTime verificationDate;
    private LocalDateTime expiryDate;
    private Map<String, String> documentStatus;
    private LocalDateTime nextReviewDate;
    private String pepStatus;
}