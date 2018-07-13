package com.service.wxtest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-07-13T02:50:48.938Z")

@RestSchema(schemaId = "wxtest")
@RequestMapping(path = "/wxtest", produces = MediaType.APPLICATION_JSON)
public class WxtestImpl {

    @Autowired
    private WxtestDelegate userWxtestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userWxtestDelegate.helloworld(name);
    }

}
