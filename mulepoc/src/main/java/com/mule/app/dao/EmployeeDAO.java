package com.mule.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mule.app.model.Employee;

@Repository("employeeDAO")
@Transactional(value = "transactionManager")
public class EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persistEmployee(Employee employee) {
		getSession().persist(employee);
	}

	public Employee findEmployeeById(String id) {
		return (Employee) getSession().get(Employee.class, id);
	}

	public void updateEmployee(Employee employee) {
		getSession().update(employee);

	}

	public void deleteEmployee(Employee employee) {
		getSession().delete(employee);

	}

}