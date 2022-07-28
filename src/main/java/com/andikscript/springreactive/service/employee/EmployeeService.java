package com.andikscript.springreactive.service.employee;

import com.andikscript.springreactive.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Flux<Employee> findAll();

    Mono<Employee> save(Employee employee);

    Mono<Employee> findById(String id);
}
