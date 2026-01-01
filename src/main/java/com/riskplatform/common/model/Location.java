package com.riskplatform.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {
    private String country;
    private String city;
    private String ip;
    private Double latitude;
    private Double longitude;
}
