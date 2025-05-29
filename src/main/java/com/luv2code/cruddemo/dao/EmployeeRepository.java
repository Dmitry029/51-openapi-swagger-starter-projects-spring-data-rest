package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employees") //the line can be skipped because it's default value
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code!
}
