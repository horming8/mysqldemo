package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Product;
import hm.app.msqldemo.repository.ProductRepository;
import hm.app.msqldemo.service.common.CrudServiceImpl;

@Service
public class ProductService extends CrudServiceImpl<Product, String> {
    
    public ProductService(ProductRepository repository) {
        super(repository);
    }

}
