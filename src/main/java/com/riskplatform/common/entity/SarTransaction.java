package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SarTransaction {
    private String transactionId;
    private String customerId;
    private Integer sarScore;
    private List<String> sarTriggers;
    private Double amount;
}
