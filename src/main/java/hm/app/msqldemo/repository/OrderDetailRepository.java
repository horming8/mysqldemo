package hm.app.msqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hm.app.msqldemo.domain.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    
}
