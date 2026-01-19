package com.ricardotec.delivery.delivery.tracking.infrastructure.http.client;

import com.ricardotec.delivery.delivery.tracking.exception.DomainException;
import com.ricardotec.delivery.delivery.tracking.domain.model.Delivery;
import com.ricardotec.delivery.delivery.tracking.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class DeliveryCheckpointService {

    private final DeliveryRepository deliveryRepository;

    public DeliveryCheckpointService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public void place(UUID deliveryId) {
        Delivery delivery = deliveryRepository.findById(deliveryId)
                .orElseThrow(()-> new DomainException());
        delivery.place();
        deliveryRepository.saveAndFlush(delivery);
    }

    public void pickUp(UUID deliveryId, UUID courierId) {
        Delivery delivery = deliveryRepository.findById(deliveryId)
                .orElseThrow(()-> new DomainException());
        delivery.pickUp(courierId);
        deliveryRepository.saveAndFlush(delivery);
    }

    public void complete(UUID deliveryId) {
        Delivery delivery = deliveryRepository.findById(deliveryId)
                .orElseThrow(()-> new DomainException());
        delivery.markAsDelivered();
        deliveryRepository.saveAndFlush(delivery);
    }
}
