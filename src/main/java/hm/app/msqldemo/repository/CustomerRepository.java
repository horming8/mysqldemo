package hm.app.msqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hm.app.msqldemo.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
