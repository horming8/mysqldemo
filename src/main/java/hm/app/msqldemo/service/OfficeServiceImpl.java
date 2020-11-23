package hm.app.msqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Office;
import hm.app.msqldemo.repository.OfficeRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OfficeServiceImpl implements OfficeService {

    private OfficeRepository repository;

    @Override
    public List<Office> findAll() {
        return repository.findAll();
    }
    
}
