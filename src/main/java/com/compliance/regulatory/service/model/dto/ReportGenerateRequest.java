package com.compliance.regulatory.service.model.dto;

import java.time.LocalDate;
import java.util.Map;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportGenerateRequest {
    private String reportType;
    private LocalDate startDate;
    private LocalDate endDate;
    private Map<String, List<String>> filters;
}