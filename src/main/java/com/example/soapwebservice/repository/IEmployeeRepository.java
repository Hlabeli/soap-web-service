package com.example.soapwebservice.repository;

import com.example.soapwebservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmployeeId(Long employeeId);
}
