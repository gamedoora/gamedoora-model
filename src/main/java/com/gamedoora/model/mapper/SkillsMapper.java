package com.gamedoora.model.mapper;

import com.gamedoora.model.dto.SkillsDTO;
import com.gamedoora.model.dao.Skills;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class SkillsMapper extends BaseMapper{
    public abstract SkillsDTO skillsToSkillsDTO(Skills skills);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Skills skillsDtoToSkills(SkillsDTO skillsDTO);
}