package com.riskplatform.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beneficiary {
    private String name;
    private String accountNumber;
    private String bankCode;
}
