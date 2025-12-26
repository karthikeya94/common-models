package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.model.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Document(collection = "rejected_transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RejectedTransaction {

    @Id
    private String transactionId;

    @Field("customerId")
    private String customerId;

    @Field("amount")
    private Double amount;

    @Field("currency")
    private String currency;

    @Field("merchant")
    private String merchant;

    @Field("merchantCategory")
    private String merchantCategory;

    @Field("location")
    private Location location;

    @Field("rejectionReason")
    private String rejectionReason;

    @Field("rejectionDetails")
    private RejectionDetails rejectionDetails;

    @Field("eventTimestamp")
    private Instant eventTimestamp;

    @Field("correlationId")
    private String correlationId;

    @Field("createdAt")
    private Instant createdAt;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RejectionDetails {
        private Double requestedAmount;
        private Double customerLimit;
        private String validationErrors;
    }
}
