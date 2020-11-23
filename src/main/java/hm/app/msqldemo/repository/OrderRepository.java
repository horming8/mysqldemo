package hm.app.msqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hm.app.msqldemo.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
