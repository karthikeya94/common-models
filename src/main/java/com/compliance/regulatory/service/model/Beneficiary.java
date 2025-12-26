package com.compliance.regulatory.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Beneficiary {
        private String name;
        private String accountNumber;
        private String bankCode;
    }