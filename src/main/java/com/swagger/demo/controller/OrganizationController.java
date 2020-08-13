package com.swagger.demo.controller;

import com.swagger.demo.model.Organization;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/organization")
@Api(tags = "Organization Api Spec")
public class OrganizationController {

    @ApiOperation(value = "Gets Organization By Id")
    @ApiResponses({@ApiResponse(code = 200, message = "OK", response = Organization.class),
            @ApiResponse(code = 400, message = "Bad Request")})
    @GetMapping("{id}")
    public Organization getOrganization(@PathVariable String id){
        return new Organization("1","spotlight");
    }

    @ApiOperation(value = "Saves Organization")
    @ApiResponses({@ApiResponse(code = 201, message = "CREATED", response = Organization.class),
            @ApiResponse(code = 400, message = "Bad Request")})
    @PostMapping
    public Organization addOrganization(@RequestBody Organization organization){
        return organization;
    }

}
