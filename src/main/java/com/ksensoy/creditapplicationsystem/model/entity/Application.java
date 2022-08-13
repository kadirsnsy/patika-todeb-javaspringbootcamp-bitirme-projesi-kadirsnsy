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
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int status; //1 approved,2 pending, 3 rejected

    @Column(nullable = false)
    private Date application_time;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "customer_application",
            joinColumns = {
                    @JoinColumn(name = "application_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "customer_id")
            }
    )
    private Customer customer;
}
