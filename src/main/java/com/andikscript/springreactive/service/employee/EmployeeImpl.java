package com.andikscript.springreactive.service.employee;

import com.andikscript.springreactive.model.Employee;
import com.andikscript.springreactive.repository.EmployeeRepository;
import reactor.core.publisher.Flux;

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
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
