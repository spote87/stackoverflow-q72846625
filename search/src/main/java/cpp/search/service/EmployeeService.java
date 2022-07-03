package cpp.search.service;

import cpp.search.entity.Employee;

import java.util.List;

public interface EmployeeService {
	List<Employee> searchEmployee(String query);

	Employee createEmployee(Employee employee);
}
