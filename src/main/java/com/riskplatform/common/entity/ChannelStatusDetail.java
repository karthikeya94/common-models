package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.NotificationChannel;
import com.riskplatform.common.enums.NotificationStatus;
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
public class ChannelStatusDetail {
    private NotificationChannel notificationChannel;
    private NotificationStatus status;
    private Instant sentAt;
    private Instant deliveredAt;
    private String error;
    private Integer retryCount;
}
