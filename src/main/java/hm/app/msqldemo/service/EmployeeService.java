package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Employee;
import hm.app.msqldemo.repository.EmployeeRepository;
import hm.app.msqldemo.service.common.CrudServiceImpl;

@Service
public class EmployeeService extends CrudServiceImpl<Employee, Long> {

    public EmployeeService(EmployeeRepository repository) {
        super(repository);
    }

}
