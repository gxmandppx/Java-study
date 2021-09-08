package com.mengying.controller;

import com.mengying.bean.Employee;
import com.mengying.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        Collection<Employee> employeeList =employeeDao.getAll();
        model.addAttribute("employeeList",employeeList);
        return "employee_list";
    }
}
