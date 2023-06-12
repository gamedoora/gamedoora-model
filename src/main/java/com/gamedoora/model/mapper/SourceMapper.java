package com.gamedoora.model.mapper;

import com.gamedoora.model.dto.SourceDTO;
import com.gamedoora.model.dao.Sources;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class SourceMapper extends BaseMapper{
    public abstract SourceDTO sourceToSourceDTO(Sources sources);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Sources sourceDtoToSources(SourceDTO sourceDTO);
}