package com.riskplatform.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeviceInfo {
    private String deviceId;
    private String type;
    private Boolean isNewDevice;
}
