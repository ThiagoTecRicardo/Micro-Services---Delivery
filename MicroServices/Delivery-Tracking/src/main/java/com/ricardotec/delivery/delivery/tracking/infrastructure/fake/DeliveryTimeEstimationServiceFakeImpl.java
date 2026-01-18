package com.ricardotec.delivery.delivery.tracking.infrastructure.fake;


import com.ricardotec.delivery.delivery.tracking.domain.model.ContactPoint;
import com.ricardotec.delivery.delivery.tracking.service.DeliveryEstimate;
import com.ricardotec.delivery.delivery.tracking.service.DeliveryTimeEstimationService;
import org.springframework.stereotype.Service;

@Service
public class DeliveryTimeEstimationServiceFakeImpl
        implements DeliveryTimeEstimationService {
    @Override
    public DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver) {
        return new DeliveryEstimate(
                Duration.ofHours(3),
                3.1
        );
    }
}
