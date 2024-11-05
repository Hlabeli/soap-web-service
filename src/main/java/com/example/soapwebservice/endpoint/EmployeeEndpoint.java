package com.example.soapwebservice.endpoint;

import com.example.soapwebservice.entity.Employee;
import com.example.soapwebservice.interfaces.AddEmployeeRequest;
import com.example.soapwebservice.interfaces.AddEmployeeResponse;
import com.example.soapwebservice.interfaces.ServiceStatus;
import com.example.soapwebservice.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeeEndpoint {

    @Autowired
    IEmployeeService employeeService;

    private static final String NAMESPACE_URI = "http://interfaces.soapwebservice.example.com";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addEmployeeRequest")
    @ResponsePayload
    public AddEmployeeResponse addEmployee(@RequestPayload AddEmployeeRequest addEmployeeRequest) {
        AddEmployeeResponse response = employeeService.addEmployee(addEmployeeRequest);
        return response;
    }
}
