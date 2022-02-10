package com.crud.service;


import java.util.Optional;

import com.crud.model.Employee;
import com.crud.repo.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;


    public Iterable<Employee> findAll(){
        return repo.findAll();
    }

    public Optional<Employee> findById(long id){
       return repo.findById(id);
    }

    public void add(Employee employee){
        repo.save(employee);
    }

    public void update(Employee employee){
        repo.save(employee);
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
