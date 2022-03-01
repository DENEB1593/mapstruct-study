package org.study.mapstruct.vo;

import org.mapstruct.Mapper;

@Mapper
public interface SimpleMapper {

    public SimpleDestination of(SimpleSource source);

    public SimpleSource of(SimpleDestination destination);

}
