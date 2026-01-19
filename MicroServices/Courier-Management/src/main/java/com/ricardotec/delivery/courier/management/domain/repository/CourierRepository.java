
package com.ricardotec.delivery.courier.management.domain.repository;

import com.ricardotec.delivery.courier.management.domain.model.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourierRepository
    extends JpaRepository<Courier, UUID> {
}
