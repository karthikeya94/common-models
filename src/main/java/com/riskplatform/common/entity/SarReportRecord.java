package com.riskplatform.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.riskplatform.common.enums.ReportType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Document(collection = "sar_reports")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SarReportRecord {

    @Id
    private String id;

    @Field("reportType")
    private ReportType reportType;

    @Field("filingDate")
    private LocalDate filingDate;

    @Field("reportingPeriod")
    private ReportingPeriod reportingPeriod;

    @Field("transactions")
    private List<SarTransaction> transactions;

    @Field("status")
    private String status;

    @Field("filedBy")
    private String filedBy;

    @Field("filedAt")
    private Instant filedAt;

    @Field("acknowledgedBy")
    private String acknowledgedBy;

    @Field("acknowledgedAt")
    private Instant acknowledgedAt;
}
