package hm.app.msqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Product;
import hm.app.msqldemo.repository.ProductRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
    
}
