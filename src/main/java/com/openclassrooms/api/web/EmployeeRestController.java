package com.openclassrooms.api.web;

import com.openclassrooms.api.dtos.AuthEmployeeDTO;
import com.openclassrooms.api.dtos.EmployeeDTO;
import com.openclassrooms.api.services.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@AllArgsConstructor
@CrossOrigin("*")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @PostMapping("/employee")
    public EmployeeDTO saveCustomer(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.saveEmployee(employeeDTO);
    }

    @PostMapping("/login")
    public AuthEmployeeDTO saveCustomer(@RequestBody AuthEmployeeDTO authEmployeeDTO){
        return employeeService.authEmployee(authEmployeeDTO);
    }

    @GetMapping("/ping")
    public String test(){
        return "Je suis un texte.";
    }




}
