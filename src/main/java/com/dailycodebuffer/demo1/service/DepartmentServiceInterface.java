package com.dailycodebuffer.demo1.service;

import com.dailycodebuffer.demo1.entity.Department;

import java.util.List;

public interface DepartmentServiceInterface {
   public Department saveDepartment(Department department);

   public void deleteColumn(Department department);

  public List<Department> fetchDepartments();

   public void deleteDepartment(Long departmentId);

   public Department getDepartment(Long departmentId);

   public Department updateDepartment(Long departmentId,Department department);
}
