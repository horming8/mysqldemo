package hm.app.msqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hm.app.msqldemo.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> { 
    
}
