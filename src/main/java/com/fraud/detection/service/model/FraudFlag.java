package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FraudFlag {
    private String flag;
    private String severity;
    private String description;

}