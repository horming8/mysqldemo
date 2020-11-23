package hm.app.msqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Employee;
import hm.app.msqldemo.repository.EmployeeRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

}
