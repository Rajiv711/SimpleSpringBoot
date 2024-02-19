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
public String deleteDepartment(@RequestBody Department department){

    departmentServiceInterface.deleteColumn(department);
      return "Department deleted succefully";
}

@DeleteMapping("/departments/{id}")
public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentServiceInterface.deleteDepartment(departmentId);
        return "Department deleted succefully";
}

@GetMapping("/departments")
public List<Department> fetchAllDepartments(){
        return departmentServiceInterface.fetchDepartments();
}
@GetMapping("/departments/{id}")
public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentServiceInterface.getDepartment(departmentId);
}



}
