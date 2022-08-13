package com.ksensoy.creditskoreservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customerCreditScore")
public class CustomerCreditScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO test sonrası yorum satırı kaldırılacak
    //  @Size(min = 11, max = 11)
    @Column(nullable = false)
    private String id_number;

    @Column(nullable = false)
    private int credit_score;
}
