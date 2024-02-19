package com.dailycodebuffer.demo1.service;

import com.dailycodebuffer.demo1.entity.Department;
import com.dailycodebuffer.demo1.repository.DepartmentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentServiceInterface {

    @Autowired
    private DepartmentRepositoryInterface departmentRepositoryInterface;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepositoryInterface.save(department);
    }

    @Override
    public void  deleteColumn(Department department) {
         departmentRepositoryInterface.deleteById (department.getDepartmentId());
    }


    @Override
    public List<Department> fetchDepartments() {
        return departmentRepositoryInterface.findAll();
    }

}
