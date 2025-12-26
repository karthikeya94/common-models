package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Document(collection = "customer_profiles")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerProfile {

    @Id
    private String id;

    @Field("customerId")
    private String customerId;

    @Field("transactionHistory")
    private List<Transaction> transactionHistory;

    @Field("averageTransactionAmount")
    private BigDecimal averageTransactionAmount;

    @Field("preferredMerchants")
    private List<String> preferredMerchants;

    @Field("preferredCategories")
    private List<String> preferredCategories;

    @Field("highRiskCountries")
    private List<String> highRiskCountries;

    @Field("deviceHistory")
    private List<CustomerDevice> deviceHistory;

    @Field("fraudHistory")
    private Boolean fraudHistory;

    @Field("previousAlerts")
    private Integer previousAlerts;

    @Field("accountAge")
    private String accountAge;

    @Field("lastUpdated")
    private Instant lastUpdated;

}