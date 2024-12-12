package com.maxima.decision_handler.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Решение банка по заявке
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanDecision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JsonIgnore
    private RequestOnCredit requestOnCredit;

    @Column(name = "final_decision")
    private Boolean finalDecision;

    @Column(name = "amount_of_credit")
    private Integer amountOfCredit;

    @Column(name = "monthly_payment")
    private Integer monthlyPayment;
}
