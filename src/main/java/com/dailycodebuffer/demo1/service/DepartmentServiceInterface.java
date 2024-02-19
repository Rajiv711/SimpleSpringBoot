package com.dailycodebuffer.demo1.service;

import com.dailycodebuffer.demo1.entity.Department;

import java.util.List;

public interface DepartmentServiceInterface {
   public Department saveDepartment(Department department);

   public void deleteColumn(Department department);

  public List<Department> fetchDepartments();
}
