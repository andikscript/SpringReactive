package com.andikscript.springreactive.repository;

import com.andikscript.springreactive.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
