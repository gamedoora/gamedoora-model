package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdStory;
import com.gamedoora.model.dto.Story;

@Mapper
public interface StoryMapper {
	Story modelToDto(GdStory project);

	GdStory dtoToModel(Story project);

	Map<String, Object> map(Map<String, Object> additionalProperties);

	List<Story> modelToNotificationsDTO(Collection<Story> project);

}
