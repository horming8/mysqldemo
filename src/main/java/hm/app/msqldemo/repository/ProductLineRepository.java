package hm.app.msqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hm.app.msqldemo.domain.ProductLine;

public interface ProductLineRepository extends JpaRepository<ProductLine, String> {
    
}
