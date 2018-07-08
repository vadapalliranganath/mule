package com.mule.app.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mule.app.dao.EmployeeDAO;
import com.mule.app.model.Employee;

@Service("employeeService")
public class EmployeeService {

	@Autowired
	@Qualifier("employeeDAO")
	private EmployeeDAO employeeDAO;

	public void persistEmployee(Employee employee) {
		employeeDAO.persistEmployee(employee);

	}

	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);

	}

	public Employee findEmployeeById(String id) {
		if (StringUtils.isNotBlank(id)) {
			return employeeDAO.findEmployeeById(id);
		}
		return null;
	}

	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee);

	}

}
