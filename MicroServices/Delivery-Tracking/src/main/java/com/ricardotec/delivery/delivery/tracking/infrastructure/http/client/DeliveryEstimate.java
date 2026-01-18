package com.ricardotec.delivery.delivery.tracking.infrastructure.http.client;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Duration;

@Getter
@AllArgsConstructor
public class DeliveryEstimate {
    private Duration estimatedTime;
    private Double distanceInKm;
}
