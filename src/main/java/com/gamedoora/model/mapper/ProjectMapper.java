package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdProjects;
import com.gamedoora.model.dto.Notification;
import com.gamedoora.model.dto.Project;

@Mapper
public interface ProjectMapper {
	Project modelToDto(GdProjects project);

	GdProjects dtoToModel(Project project);

	Map<String, Object> map(Map<String, Object> additionalProperties);

	List<Project> modelToNotificationsDTO(Collection<Project> project);
}
