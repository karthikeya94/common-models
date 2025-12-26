package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Transaction {
    private String id;
    private String customerId;
    private BigDecimal amount;
    private String merchant;
    private String merchantCategory;
    private Instant timestamp;
    private LocationInfo location;
    private DeviceInfo device;

}