package com.openclassrooms.api.mappers;

import com.openclassrooms.api.dtos.AuthEmployeeDTO;
import com.openclassrooms.api.dtos.EmployeeDTO;
import com.openclassrooms.api.entities.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapperImpl {


    public EmployeeDTO fromEmployee(Employee employee){
        EmployeeDTO EmployeeDTO = new EmployeeDTO();
        BeanUtils.copyProperties(employee, EmployeeDTO);
        EmployeeDTO.setEmail(employee.getMail());
        return EmployeeDTO;
    }


    public Employee fromEmployeeDTO(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        employee.setMail(employeeDTO.getEmail());
        return employee;
    }


    public AuthEmployeeDTO fromAuthEmployee(Employee employee){
        AuthEmployeeDTO authEmployeeDTO = new AuthEmployeeDTO();
        BeanUtils.copyProperties(employee, authEmployeeDTO);
        return authEmployeeDTO;
    }


    public Employee fromAuthEmployeeDTO(AuthEmployeeDTO authEmployeeDTO){
        Employee employee = new Employee();
        BeanUtils.copyProperties(authEmployeeDTO, employee);
        return employee;
    }





}
