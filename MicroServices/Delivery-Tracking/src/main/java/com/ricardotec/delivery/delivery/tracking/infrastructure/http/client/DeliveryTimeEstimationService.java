package com.ricardotec.delivery.delivery.tracking.infrastructure.http.client;

import com.ricardotec.delivery.delivery.tracking.domain.model.ContactPoint;

public interface DeliveryTimeEstimationService {
    DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver);
}
