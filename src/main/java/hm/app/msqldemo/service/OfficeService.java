package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Office;
import hm.app.msqldemo.repository.OfficeRepository;
import hm.app.msqldemo.service.common.CrudServiceImpl;

@Service
public class OfficeService extends CrudServiceImpl<Office, String> {

    public OfficeService(OfficeRepository repository) {
        super(repository);
    }

}
