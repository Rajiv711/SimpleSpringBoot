package com.dailycodebuffer.demo1.controller;

import com.dailycodebuffer.demo1.entity.Department;
import com.dailycodebuffer.demo1.service.DepartmentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentServiceInterface departmentServiceInterface;
    @PostMapping("/departments")
public Department saveDepartment(@RequestBody Department department){
     return departmentServiceInterface.saveDepartment(department);
}
  @DeleteMapping("/departments")
public void deleteDepartment(@RequestBody Department department){
        System.out.println("Department deleted succefully");
    departmentServiceInterface.deleteColumn(department);
}
@GetMapping("/departments")
public List<Department> fetchAllDepartments(){
        return departmentServiceInterface.fetchDepartments();
}



}
