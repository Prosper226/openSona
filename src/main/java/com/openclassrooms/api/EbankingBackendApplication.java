package com.openclassrooms.api;

import com.openclassrooms.api.dtos.EmployeeDTO;
import com.openclassrooms.api.services.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EbankingBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(EbankingBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner CommandLineRunner(EmployeeService employeeService) {
        return args -> {

            List<String> names = Arrays.asList(
                    "Prosper", "Fatim"
            );

            names.forEach(name -> {
                EmployeeDTO employeeDTO = new EmployeeDTO();
                employeeDTO.setEmail(name + "@gmail.com");
                employeeDTO.setFirstName(name.toUpperCase());
                employeeDTO.setLastName(name.toLowerCase());
                employeeService.saveEmployee(employeeDTO);
            });
        };
    }



}
