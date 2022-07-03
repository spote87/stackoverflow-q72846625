package cpp.search.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cpp.search.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	@Query("SELECT e FROM Employee e WHERE " +
			"e.firstName LIKE CONCAT('%', :query, '%')" +
			"Or e.lastName LIKE CONCAT('%', :query, '%')" +
			"Or e.id LIKE CONCAT('%', :query, '%')")
	List<Employee> searchEmployee(String query);
}
