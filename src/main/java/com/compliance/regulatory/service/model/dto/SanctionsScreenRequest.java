package com.compliance.regulatory.service.model.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SanctionsScreenRequest {
    private String customerId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String address;
    private List<String> databases;
}