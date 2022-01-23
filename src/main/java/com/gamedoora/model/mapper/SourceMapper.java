package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdSource;
import com.gamedoora.model.dto.Source;

@Mapper
public interface SourceMapper {
	Source modelToDto(GdSource project);

	GdSource dtoToModel(Source project);

	Map<String, Object> map(Map<String, Object> additionalProperties);

	List<Source> modelToNotificationsDTO(Collection<Source> project);

}
