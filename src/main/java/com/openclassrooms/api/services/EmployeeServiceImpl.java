package com.openclassrooms.api.services;

import com.openclassrooms.api.dtos.AuthEmployeeDTO;
import com.openclassrooms.api.dtos.EmployeeDTO;
import com.openclassrooms.api.entities.Employee;
import com.openclassrooms.api.mappers.EmployeeMapperImpl;
import com.openclassrooms.api.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private EmployeeMapperImpl dtoMapper;

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        log.info("Saving new employee");
        Employee employee = dtoMapper.fromEmployeeDTO(employeeDTO);
        employee.setPassword("12345");
        Employee saveEmployee =  employeeRepository.save(employee);
        return dtoMapper.fromEmployee(saveEmployee);
    }

    @Override
    public AuthEmployeeDTO authEmployee(AuthEmployeeDTO authEmployeeDTO) {
        log.info("login existing employee");
        log.info(authEmployeeDTO.getMail());
        Employee employee =  employeeRepository.findByMailEqualsAndPassword(authEmployeeDTO.getMail(),authEmployeeDTO.getPassword());
        if(employee == null){

        }
        return dtoMapper.fromAuthEmployee(employee);
    }







}


