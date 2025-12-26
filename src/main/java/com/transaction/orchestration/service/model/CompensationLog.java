package com.transaction.orchestration.service.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "compensation_logs")
public class CompensationLog {
    @Id
    private String id;
    private String sagaId;
    private String stepId;
    private String action;
    private String effect;
    private Date timestamp;
    private String reason;
    private String idempotencyKey;
}