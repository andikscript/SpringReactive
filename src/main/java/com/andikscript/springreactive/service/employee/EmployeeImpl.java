package com.andikscript.springreactive.service.employee;

import com.andikscript.springreactive.model.Employee;
import com.andikscript.springreactive.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Flux<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Mono<Employee> save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Mono<Employee> findById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        employeeRepository.deleteById(id);
    }
}
