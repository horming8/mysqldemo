package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Product;
import hm.app.msqldemo.repository.ProductRepository;
import hm.app.msqldemo.service.common.CrudService;

@Service
public class ProductService extends CrudService<Product, String> {
    
    public ProductService(ProductRepository repository) {
        super(repository);
    }

}
