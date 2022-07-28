package com.andikscript.springreactive.controller;

import com.andikscript.springreactive.model.Employee;
import com.andikscript.springreactive.service.employee.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(employeeService.save(employee));
    }

//    @GetMapping(value = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @GetMapping(value = "/all")
    public ResponseEntity<Flux<Employee>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(employeeService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mono<Employee>> findById(@PathVariable(value = "id") String id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(employeeService.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteById(@PathVariable(value = "id") String id) {
        employeeService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Delete success");
    }
}
