package com.ksensoy.creditapplicationsystem.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "credit_score")
public class CreditScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int score;

    @Column(nullable = false)
    private Date score_time;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "customer_credit_score",
            joinColumns = {
                    @JoinColumn(name = "credit_score_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "customer_id")
            }
    )
    private Customer customer;
}
