package com.ricardotec.delivery.delivery.tracking.infrastructure.fake;


import com.ricardotec.delivery.delivery.tracking.domain.model.ContactPoint;
import com.ricardotec.delivery.delivery.tracking.service.DeliveryEstimate;
import com.ricardotec.delivery.delivery.tracking.service.DeliveryTimeEstimationService;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class DeliveryTimeEstimationServiceFakeImpl
        implements DeliveryTimeEstimationService {
    @Override
    public DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver) {
        return new DeliveryEstimate(
        );
    }
}
