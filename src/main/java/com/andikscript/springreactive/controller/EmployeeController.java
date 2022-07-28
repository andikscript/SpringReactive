package com.andikscript.springreactive.controller;

import com.andikscript.springreactive.model.Employee;
import com.andikscript.springreactive.service.employee.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Success create");
    }

    @GetMapping(value = "/all")
    public ResponseEntity<Flux<Employee>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(employeeService.findAll());
    }
}
