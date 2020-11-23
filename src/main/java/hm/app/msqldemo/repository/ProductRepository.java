package hm.app.msqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hm.app.msqldemo.domain.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    
}
