package com.gamedoora.model.mapper;

import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdSkills;
import com.gamedoora.model.dto.Skill;

@Mapper
public interface SkillMapper {

	// is DAO & DTO classes are different
	// if yes then for map object we need this
	Skill modelToDto(GdSkills skill);

	GdSkills dtoToModel(Skill skill);

}
