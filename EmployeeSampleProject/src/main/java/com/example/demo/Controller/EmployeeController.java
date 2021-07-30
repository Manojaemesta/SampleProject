package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAOInter.EmployeeDAO;
import com.example.demo.DO.EmployeeDO;

@RestController
public class EmployeeController {


	@Autowired
	EmployeeDAO empDAO;

	//for save the Employee
	@PostMapping("/Employee")
	public void saveEmplyee(@RequestBody EmployeeDO employeeDO)
	{		
		empDAO.save(employeeDO);
	}

	//To get the Employee by deptCode
	@GetMapping("/Employee/{deptCode}")
	public List<EmployeeDO> getEmplyeeByCode(@PathVariable String deptCode)
	{		
		return empDAO.findByDeptCode(deptCode);
	}
	
	
	//To get the all Employee
	@GetMapping("/Employee")
	public List<EmployeeDO> getEmplyee()
	{		
		return empDAO.findAll();
	}

	//For Deleting the Employee
	@DeleteMapping("/Employee/{empId}")
	public void deleteEmployee(@PathVariable int empId)
	{
		empDAO.deleteById(empId);
	}

	// For save or update the Employee
	@PutMapping("/Employee")
	public void saveOrUpdateEmployee(@RequestBody EmployeeDO employeeDO)
	{		
		empDAO.save(employeeDO);
	}
}
