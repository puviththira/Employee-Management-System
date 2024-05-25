package com.example.employee.service;

import com.example.employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<Object> getAllEmployees();

    EmployeeDto createEmployee(EmployeeDto employee);

    EmployeeDto getEmployeeById(Long employeeId);

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);
}
