package io.daff.service;

import io.daff.entity.Employee;
import io.daff.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author daffupman
 * @since 2020/1/29
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }

    public void batchUpdateSelective(List<Employee> employees) {
        employeeMapper.batchUpdateSelective(employees);
    }
}
