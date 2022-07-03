package cpp.search.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cpp.search.entity.Employee;
import cpp.search.repository.EmployeeRepository;
import cpp.search.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> searchEmployee(String query) {
		List<Employee> employees = employeeRepository.searchEmployee(query);
		return employees;
	}
	@Override 
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
