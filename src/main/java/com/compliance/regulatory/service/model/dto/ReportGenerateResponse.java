package com.compliance.regulatory.service.model.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportGenerateResponse {
    private String reportId;
    private String reportType;
    private LocalDateTime generatedAt;
    private Integer totalRecords;
    private String fileUrl;
    private String status;
    private String filingDeadline;
}