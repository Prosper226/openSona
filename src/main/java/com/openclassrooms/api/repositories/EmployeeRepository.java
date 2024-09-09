package com.openclassrooms.api.repositories;


import com.openclassrooms.api.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByMailEqualsAndPassword(String email, String password);

}

