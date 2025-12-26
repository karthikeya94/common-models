package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LocationInfo {
    private String country;
    private String city;
    private String ip;
    private Double latitude;
    private Double longitude;

}