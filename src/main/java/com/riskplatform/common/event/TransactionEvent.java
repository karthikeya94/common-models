package com.riskplatform.common.event;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.EventType;
import com.riskplatform.common.model.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionEvent {
    private String eventId;
    private String transactionId;
    private String customerId;
    private Double amount;
    private String currency;
    private String merchant;
    private String merchantCategory;
    private Instant timestamp;
    private String channel;
    private String device;
    private Location location;
    private EventType eventType;
    private Instant eventTimestamp;
    private String correlationId;
}
