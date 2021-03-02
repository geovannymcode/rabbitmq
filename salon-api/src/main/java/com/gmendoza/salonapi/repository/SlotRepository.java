package com.gmendoza.salonapi.repository;

import com.gmendoza.salonapi.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slot, Long> {
}
