package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerRiskContext {
    private Boolean fraudHistory;
    private Integer previousAlerts;
    private String accountAge;

}