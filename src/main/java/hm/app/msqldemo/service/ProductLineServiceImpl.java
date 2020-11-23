package hm.app.msqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.ProductLine;
import hm.app.msqldemo.repository.ProductLineRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductLineServiceImpl implements ProductLineService {

    private ProductLineRepository repository;

    @Override
    public List<ProductLine> findAll() {
        return repository.findAll();
    }

}
