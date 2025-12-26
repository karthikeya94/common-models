package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.NotificationChannel;
import com.riskplatform.common.enums.NotificationStatus;
import com.riskplatform.common.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.List;

@Document(collection = "notifications")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Notification {

    @Id
    private String id;

    @Field("notificationId")
    private String notificationId;

    @Field("customerId")
    private String customerId;

    @Field("eventType")
    private String eventType;

    @Field("channels")
    private List<NotificationChannel> channels;

    @Field("content")
    private NotificationContent content;

    @Field("priority")
    private Priority priority;

    @Field("status")
    private NotificationStatus status;

    @Field("channelStatuses")
    private List<ChannelStatusDetail> channelStatuses;

    @Field("createdAt")
    private Instant createdAt;

    @Field("updatedAt")
    private Instant updatedAt;

    @Field("retryCount")
    private Integer retryCount;
}
