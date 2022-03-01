package org.study.mapstruct.vo;

import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface EmployeeMapper {

    @Mappings({
            @Mapping(target="employeeId", source="entity.id"),
            @Mapping(target="employeeName", source="entity.name")
    })
    EmployeeDTO employeeToEmployeeDTO(Employee entity);
    @Mappings({
            @Mapping(target="id", source="dto.employeeId"),
            @Mapping(target="name", source="dto.employeeName")
    })
    Employee employeeDTOtoEmployee(EmployeeDTO dto);

}
