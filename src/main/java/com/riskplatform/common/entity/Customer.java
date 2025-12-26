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
import java.util.List;

@Document(collection = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {

    @Id
    private String customerId;

    @Field("name")
    private String name;

    @Field("firstName")
    private String firstName;

    @Field("lastName")
    private String lastName;

    @Field("email")
    private String email;

    @Field("phone")
    private String phone;

    @Field("dateOfBirth")
    private String dateOfBirth;

    @Field("address")
    private String address;

    @Field("status")
    private String status;

    @Field("tier")
    private String tier;

    @Field("dailyLimit")
    private Double dailyLimit;

    @Field("transactionLimit")
    private Double transactionLimit;

    @Field("blacklisted")
    private Boolean blacklisted;

    @Field("allowedCountries")
    private List<String> allowedCountries;

    @Field("createdAt")
    private Instant createdAt;

    @Field("updatedAt")
    private Instant updatedAt;
}
