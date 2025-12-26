package com.compliance.regulatory.service.model.dto;

import com.compliance.regulatory.service.model.Beneficiary;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmlCheckRequest {
    private String transactionId;
    private String customerId;
    private Double amount;
    private Beneficiary beneficiary;
}