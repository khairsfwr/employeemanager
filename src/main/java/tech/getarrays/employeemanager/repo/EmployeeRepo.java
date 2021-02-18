package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
