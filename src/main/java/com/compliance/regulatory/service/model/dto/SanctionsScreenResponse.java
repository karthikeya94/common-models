package com.compliance.regulatory.service.model.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SanctionsScreenResponse {
    private String customerId;
    private String screeningResult;
    private List<Hit> hits;
    private Integer overallScore;
    private String action;
    private Boolean caseCreated;
    private String caseId;
    private LocalDateTime timestamp;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Hit {
        private String database;
        private String matchType;
        private Integer matchScore;
        private String sanctionedName;
        private String sanctionProgram;
        private String severity;
    }
}