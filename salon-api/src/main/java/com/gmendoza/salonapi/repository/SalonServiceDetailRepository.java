package com.gmendoza.salonapi.repository;

import com.gmendoza.salonapi.entity.SalonServiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonServiceDetailRepository extends JpaRepository<SalonServiceDetail, Long> {
}
