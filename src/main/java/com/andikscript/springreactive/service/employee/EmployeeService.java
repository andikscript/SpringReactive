package com.andikscript.springreactive.service.employee;

import com.andikscript.springreactive.model.Employee;
import reactor.core.publisher.Flux;

public interface EmployeeService {

    Flux<Employee> findAll();

    void save(Employee employee);
}
