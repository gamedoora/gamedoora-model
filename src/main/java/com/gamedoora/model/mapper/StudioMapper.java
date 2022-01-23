package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdStudio;
import com.gamedoora.model.dto.Studio;

@Mapper
public interface StudioMapper {
	Studio modelToDto(GdStudio project);

	GdStudio dtoToModel(Studio project);

	Map<String, Object> map(Map<String, Object> additionalProperties);

	List<Studio> modelToNotificationsDTO(Collection<Studio> project);
}
