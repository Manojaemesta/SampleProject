package com.example.demo.DAOInter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.DO.EmployeeDO;

public interface EmployeeDAO extends JpaRepository<EmployeeDO, Integer>{
	List<EmployeeDO> findByDeptCode(String id);

}
