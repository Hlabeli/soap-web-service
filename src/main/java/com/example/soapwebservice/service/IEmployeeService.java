package com.example.soapwebservice.service;

import com.example.soapwebservice.entity.Employee;
import com.example.soapwebservice.interfaces.AddEmployeeRequest;
import com.example.soapwebservice.interfaces.AddEmployeeResponse;
import com.example.soapwebservice.interfaces.GetEmployeeByIdRequest;
import com.example.soapwebservice.interfaces.GetEmployeeResponse;

public interface IEmployeeService {

    public AddEmployeeResponse addEmployee(AddEmployeeRequest request);
    void updateEmployee(Employee employee);
    void deleteEmployee(long employee);
    public GetEmployeeResponse getEmployeeById(GetEmployeeByIdRequest request);
}
