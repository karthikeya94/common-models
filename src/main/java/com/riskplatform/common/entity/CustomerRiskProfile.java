package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.RiskLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.List;

@Document(collection = "customer_risk_profile")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerRiskProfile {

    @Id
    private String customerId;

    @Field("currentRiskScore")
    private Integer currentRiskScore;

    @Field("previousRiskScore")
    private Integer previousRiskScore;

    @Field("riskLevel")
    private RiskLevel riskLevel;

    @Field("scoreHistory")
    private List<ScoreHistoryEntry> scoreHistory;

    @Field("monthlyStats")
    private MonthlyStats monthlyStats;

    @Field("riskFactorStatus")
    private RiskFactorStatus riskFactorStatus;

    @Field("lastUpdated")
    private Instant lastUpdated;

    @Field("updatedBy")
    private String updatedBy;

    @Field("version")
    private Long version;
}
