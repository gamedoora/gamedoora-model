package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdStoryUser;
import com.gamedoora.model.dto.UserStories;

@Mapper
public interface UserStoryMapper {
	UserStories modelToDto(GdStoryUser project);

	GdStoryUser dtoToModel(UserStories project);

	Map<String, Object> map(Map<String, Object> additionalProperties);

	List<UserStories> modelToNotificationsDTO(Collection<UserStories> project);

}
