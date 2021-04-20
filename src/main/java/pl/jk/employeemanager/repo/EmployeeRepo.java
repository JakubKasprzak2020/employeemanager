package pl.jk.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jk.employeemanager.model.Employee;

import java.util.Optional;

//@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional <Employee> findEmployeeById(Long id);
}
