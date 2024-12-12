package com.maxima.decision_handler.repository;


import com.maxima.decision_handler.model.LoanDecision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanDecisionRepository extends JpaRepository<LoanDecision, Long> {

}
