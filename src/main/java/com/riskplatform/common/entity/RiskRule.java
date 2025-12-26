package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.RuleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.util.Map;

@Document(collection = "risk_rules")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RiskRule {

    @Id
    private String ruleId;

    @Field("ruleName")
    private String ruleName;

    @Field("ruleType")
    private RuleType ruleType;

    @Field("parameters")
    private Map<String, Object> parameters;

    @Field("enabled")
    private Boolean enabled;

    @Field("effectiveDate")
    private Instant effectiveDate;

    @Field("version")
    private Long version;

    @Field("createdAt")
    private Instant createdAt;

    @Field("updatedAt")
    private Instant updatedAt;
}
