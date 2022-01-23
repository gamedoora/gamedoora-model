package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdIdentity;
import com.gamedoora.model.dto.Identity;

@Mapper
public interface IndentityMapper {

	Identity modelToDto(GdIdentity project);

	GdIdentity dtoToModel(Identity project);

	Map<String, Object> map(Map<String, Object> additionalProperties);

	List<Identity> modelToNotificationsDTO(Collection<Identity> project);

}
