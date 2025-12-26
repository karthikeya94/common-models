package com.compliance.regulatory.service.model.entity;

import java.time.LocalDateTime;

import com.compliance.regulatory.service.model.Beneficiary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transaction_details")
public class TransactionDetails {
    
    @Id
    private String id;
    
    private String customerId;
    private Double amount;
    private String currency;
    private Beneficiary beneficiary;
    private String transactionType;
    private LocalDateTime timestamp;
    private String sourceAccount;
    private String destinationAccount;
    private String purpose;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}