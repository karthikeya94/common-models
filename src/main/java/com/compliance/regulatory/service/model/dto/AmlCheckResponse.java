package com.compliance.regulatory.service.model.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmlCheckResponse {
    private String transactionId;
    private String amlStatus;
    private Checks checks;
    private Boolean reportingRequired;
    private String reportType;
    private String reportFilingDeadline;
    private LocalDateTime timestamp;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Checks {
        // For PASS responses
        private String sanctionsList;
        private String internalBlacklist;
        private String ctrThreshold;
        private String sarIndicators;
        private String beneficiaryCheck;
        
        // For SAR responses
        private String structuredDeposits;
        private Integer sarScore;
        private List<String> sarTriggers;
    }
}