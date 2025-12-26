package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.ActionType;
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
public class Resolution {
    private ActionType action;
    private String reason;
    private String resolvedBy;
    private Instant resolvedAt;
    private String notes;
}
