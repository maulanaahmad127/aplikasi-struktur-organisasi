package com.crud.repo;

import com.crud.model.Employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

    
}
