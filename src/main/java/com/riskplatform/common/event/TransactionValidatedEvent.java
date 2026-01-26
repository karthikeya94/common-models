package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.model.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionValidatedEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private Double amount;
    private String currency;
    private String merchant;
    private String merchantCategory;
    private Location location;
    private Instant timestamp;
    private LocalDateTime localTimestamp;
    private String channel;
    private String device;
    private String eventType;
    private Instant eventTimestamp;
    private String correlationId;
    private String rejectionReason;
    private RejectionDetails rejectionDetails;
    private String sourceAccount;
    private String destinationAccount;
    private String transactionType;
    private String customerFirstName;
    private String customerLastName;
    private String customerDob;
    private String customerAddress;
    private String beneficiaryName;
    private String beneficiaryAccount;
    private String beneficiaryBankCode;
}
