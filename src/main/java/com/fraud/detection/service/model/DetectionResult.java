package com.fraud.detection.service.model;

import com.fraud.detection.service.model.enums.FraudType;
import com.fraud.detection.service.model.enums.ActionType;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DetectionResult {
    private FraudType type;
    private Integer confidence;
    private String status;
    private ActionType action;
    private String reason;
    private Map<String, Object> details;

}