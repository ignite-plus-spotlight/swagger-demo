package com.swagger.demo.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {

    @ApiModelProperty(notes = "Its Auto Generated By BackEnd")
    private String organizationId;
    @ApiModelProperty(notes = "Organization Name")
    private String organizationName;

}
