package com.fraud.detection.service.model;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RequiredAction {
    private String type;
    private String channel;
    private Integer expirySeconds;

}