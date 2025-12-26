package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.Map;

@Document(collection = "risk_events")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventStoreEntry {

    @Id
    private String id;

    @Field("aggregateId")
    private String aggregateId;

    @Field("aggregateType")
    private String aggregateType;

    @Field("eventType")
    private String eventType;

    @Field("eventVersion")
    private Integer eventVersion;

    @Field("eventData")
    private Map<String, Object> eventData;

    @Field("metadata")
    private EventMetadata metadata;

    @Field("version")
    private Long version;

    @Field("timestamp")
    private Instant timestamp;
}
