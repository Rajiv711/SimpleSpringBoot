package com.dailycodebuffer.demo1.service;

import com.dailycodebuffer.demo1.entity.Department;
import com.dailycodebuffer.demo1.repository.DepartmentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepositoryInterface.deleteById(departmentId);
    }

    @Override
    public Department getDepartment(Long departmentId) {
        return departmentRepositoryInterface.findById(departmentId).get();
    }

    @Override
    public Department updateDepartment(Long departmentId,Department department) {

        Department depDB=departmentRepositoryInterface.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName())&&!".".equalsIgnoreCase(department.getDepartmentName())){
            depDB.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())&&!".".equalsIgnoreCase(department.getDepartmentCode())){
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getdepartmentAddress())&&!".".equalsIgnoreCase(department.getdepartmentAddress())){
            depDB.setdepartmentAddress(department.getdepartmentAddress());
        }
        return departmentRepositoryInterface.save(depDB);
    }


}
