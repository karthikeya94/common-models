package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.model.Location;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Document(collection = "transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transaction {

    @Id
    private String id;

    @Field("transactionId")
    private String transactionId;

    @Field("customerId")
    private String customerId;

    @Field("amount")
    private BigDecimal amount;

    @Field("currency")
    private String currency;

    @Field("merchant")
    private String merchant;

    @Field("merchantCategory")
    private String merchantCategory;

    @Field("timestamp")
    private Instant timestamp;

    @Field("channel")
    private String channel;

    @Field("device")
    private String device;

    @Field("location")
    private Location location;

    @Field("status")
    private String status;

    @Field("beneficiary")
    private com.riskplatform.common.model.Beneficiary beneficiary;

    @Field("destinationAccount")
    private String destinationAccount;

    @Field("validationDetails")
    private ValidationDetails validationDetails;

    @Field("riskFlags")
    private List<String> riskFlags;

    @Field("createdAt")
    private Instant createdAt;

    @Field("updatedAt")
    private Instant updatedAt;

    @Field("version")
    @Version
    private Long version;
}
