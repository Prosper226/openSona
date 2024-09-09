package com.openclassrooms.api.services;

import com.openclassrooms.api.dtos.AuthEmployeeDTO;
import com.openclassrooms.api.dtos.EmployeeDTO;

public interface EmployeeService {

    EmployeeDTO saveEmployee (EmployeeDTO employeeDTO);

    AuthEmployeeDTO authEmployee(AuthEmployeeDTO authEmployeeDTO);
}
