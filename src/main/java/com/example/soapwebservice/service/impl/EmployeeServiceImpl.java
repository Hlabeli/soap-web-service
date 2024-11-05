package com.example.soapwebservice.service.impl;

import com.example.soapwebservice.entity.Employee;
import com.example.soapwebservice.interfaces.*;
import com.example.soapwebservice.repository.IEmployeeRepository;
import com.example.soapwebservice.service.IEmployeeService;
import com.example.soapwebservice.transformer.EmployeeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    IEmployeeRepository employeeRepository;

    @Autowired
    EmployeeHandler employeeHandler;

    @Override
    public AddEmployeeResponse addEmployee(AddEmployeeRequest request) {

        Employee empModel = employeeHandler.preparedEmployeeModel(request);
        employeeRepository.save(empModel);

        AddEmployeeResponse addEmployeeResponse = new AddEmployeeResponse();

        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Employee added successfully");
        addEmployeeResponse.setServiceStatus(serviceStatus);

        return addEmployeeResponse;
    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(long employee) {

    }

    @Override
    public GetEmployeeResponse getEmployeeById(GetEmployeeByIdRequest request) {
        return null;
    }
}
