package com.crud.controller;

import com.crud.model.Employee;
import com.crud.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping
    public String home(Model model){
        model.addAttribute("msg", "Welcome To Employee CRUD");
        model.addAttribute("employees", employeeService.findAll());
        
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("msg", "Welcome To Employee CRUD");
        model.addAttribute("employee", new Employee());
        return "add";
    }

    @PostMapping("/save")
    public String save(Model model, Employee employee){
        model.addAttribute("msg", "Welcome To Employee CRUD");
        model.addAttribute("employee", employee);
        employeeService.add(employee);
        model.addAttribute("employees", employeeService.findAll());
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        employeeService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Model model, Employee employee){
        model.addAttribute("employee", employeeService.findById(id));
        
        return "edit";
    }

    @PostMapping("/update")
    public String update(Model model, Employee employee){
        
        employeeService.update(employee);
        System.out.println(employee.getId());
        return "redirect:/";
    }

    
}
