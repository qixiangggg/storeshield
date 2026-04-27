package com.storeshield.backend.expiryrecord;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpiryRecordRepository extends JpaRepository<ExpiryRecord, Long> {
    List<ExpiryRecord> findByExpiryDateBeforeAndStatus(LocalDate expiryDate, Status status);
}
