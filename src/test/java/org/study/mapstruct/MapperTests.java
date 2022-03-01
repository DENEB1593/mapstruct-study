package org.study.mapstruct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.study.mapstruct.vo.Employee;
import org.study.mapstruct.vo.EmployeeDTO;
import org.study.mapstruct.vo.EmployeeMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MapperTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void mapperTest() {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setEmployeeId(1);
        dto.setEmployeeName("John");

        Employee entity = employeeMapper.employeeDTOtoEmployee(dto);

        System.out.println(entity.getName());

        assertEquals(dto.getEmployeeId(), entity.getId());
        assertEquals(dto.getEmployeeName(), entity.getName());
    }

}
