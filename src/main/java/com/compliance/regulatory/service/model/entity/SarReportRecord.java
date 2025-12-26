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
@Document(collection = "sar_reports")
public class SarReportRecord {
    
//    @Id
    private String id;
    
    private String reportType;
    private LocalDateTime filingDate;
    private ReportingPeriod reportingPeriod;
    private List<TransactionDetail> transactions;
    private String status;
    private String filedBy;
    private LocalDateTime filedAt;
    private String acknowledgedBy;
    private LocalDateTime acknowledgedAt;
    private String fileUrl;
    private LocalDateTime filingDeadline;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReportingPeriod {
        private LocalDateTime startDate;
        private LocalDateTime endDate;
    }
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TransactionDetail {
        private String transactionId;
        private String customerId;
        private Integer sarScore;
        private List<String> sarTriggers;
        private Double amount;
        private String currency;
        private LocalDateTime timestamp;
    }
}