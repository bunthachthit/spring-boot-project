package com.bunthach.spring_data_jpa.controller;import com.bunthach.spring_data_jpa.dto.EmployeeRequest;import com.bunthach.spring_data_jpa.model.Employee;import com.bunthach.spring_data_jpa.service.EmployeeService;import org.springframework.http.HttpStatus;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;@RestController@RequestMapping("/employees")public class EmployeeController {    private final EmployeeService employeeService;    public EmployeeController(EmployeeService employeeService) {        this.employeeService = employeeService;    }    @PostMapping("/addEmployee")    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeRequest request){        Employee save = employeeService.addEmployee(request);        return ResponseEntity.status(HttpStatus.CREATED).body(save);    }}