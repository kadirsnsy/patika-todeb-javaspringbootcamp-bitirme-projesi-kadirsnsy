package com.ksensoy.creditskoreservice.model.Repository;

import com.ksensoy.creditskoreservice.model.entity.CustomerCreditScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCreditScoreRepository extends JpaRepository<CustomerCreditScore, Long> {
}
