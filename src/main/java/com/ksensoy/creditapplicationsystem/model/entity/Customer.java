package com.ksensoy.creditapplicationsystem.model.entity;

import com.sun.xml.internal.bind.v2.TODO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, max = 20)
    @Column(nullable = false)
    private String first_name;

    @Size(min = 3, max = 30)
    @Column(nullable = false)
    private String last_name;

    // TODO test sonrası yorum satırı kaldırılacak
    //  @Size(min = 11, max = 11)
    @Column(nullable = false)
    private String id_number;

    // TODO test sonrası yorum satırı kaldırılacak
   // @Size(min = 10, max = 10)
    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private int monthly_income;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.MERGE)
    private Application application;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.MERGE)
    private CreditScore creditScore;
}
