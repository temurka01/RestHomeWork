package com.maxima.central_bank.repository;

import com.maxima.central_bank.model.RequestOnCredit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RequestOnCreditRepository extends JpaRepository<RequestOnCredit, Long> {

    Optional<RequestOnCredit> findByClientInfo_Id(Long id);
}
