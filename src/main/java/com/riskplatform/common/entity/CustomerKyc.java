package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.KycStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;

@Document(collection = "customer_kyc")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerKyc {

    @Id
    private String customerId;

    @Field("verificationStatus")
    private KycStatus verificationStatus;

    @Field("kycLevel")
    private Integer kycLevel;

    @Field("verificationDate")
    private Instant verificationDate;

    @Field("expiryDate")
    private Instant expiryDate;

    @Field("documentType")
    private String documentType;

    @Field("documentNumber")
    private String documentNumber;

    @Field("verifiedBy")
    private String verifiedBy;

    @Field("pepStatus")
    private String pepStatus;

    @Field("createdAt")
    private Instant createdAt;

    @Field("updatedAt")
    private Instant updatedAt;
}
