package hm.app.msqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hm.app.msqldemo.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    
}
