package com.ricardotec.delivery.delivery.tracking.infrastructure.http.client;

import java.math.BigDecimal;

public interface CourierPayoutCalculationService {
    BigDecimal calculatePayout(Double distanceInKm);
}
