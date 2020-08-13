package com.swagger.demo.controller;

import com.swagger.demo.model.Employee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@Api(tags = "Employee Api Spec")
public class EmployeeController {

    @ApiOperation(value = "Gets Employee By Id")
    @ApiResponses({@ApiResponse(code = 200, message = "OK", response = Employee.class),
            @ApiResponse(code = 400, message = "Bad Request")})
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployee(@PathVariable String id){
        return new Employee("1","ignite");
    }

    @ApiOperation(value = "Saves Employee")
    @ApiResponses({@ApiResponse(code = 201, message = "CREATED", response = Employee.class),
            @ApiResponse(code = 400, message = "Bad Request")})
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee){
        return employee;
    }
}
