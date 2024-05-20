package project.springboot.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.springboot.webapp.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
