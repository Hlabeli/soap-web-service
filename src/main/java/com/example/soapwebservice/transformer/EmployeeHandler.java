package com.example.soapwebservice.transformer;

import com.example.soapwebservice.entity.Employee;
import com.example.soapwebservice.interfaces.AddEmployeeRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EmployeeHandler {

    public Employee preparedEmployeeModel(AddEmployeeRequest addEmployeeRequest) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(addEmployeeRequest.getEmployeeInfo(), employee);
        return employee;
    }
}
