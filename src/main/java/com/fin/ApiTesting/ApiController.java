package com.fin.ApiTesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class ApiController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Welcome to GIT ";
    }





}
