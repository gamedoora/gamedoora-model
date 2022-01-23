package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdTask;
import com.gamedoora.model.dto.Task;

@Mapper
public interface GdTaskMapper {
	Task modelToDto(GdTask project);

	GdTask dtoToModel(Task project);

	Map<String, Object> map(Map<String, Object> additionalProperties);

	List<Task> modelToNotificationsDTO(Collection<Task> project);

}
