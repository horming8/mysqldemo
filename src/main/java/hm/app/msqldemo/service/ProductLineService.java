package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.ProductLine;
import hm.app.msqldemo.repository.ProductLineRepository;
import hm.app.msqldemo.service.common.CrudService;

@Service
public class ProductLineService extends CrudService<ProductLine, String> {

    public ProductLineService(ProductLineRepository repository) {
        super(repository);
    }

}
