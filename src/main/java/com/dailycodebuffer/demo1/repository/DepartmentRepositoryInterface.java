package com.dailycodebuffer.demo1.repository;

import com.dailycodebuffer.demo1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoryInterface extends JpaRepository<Department,Long> {

}
