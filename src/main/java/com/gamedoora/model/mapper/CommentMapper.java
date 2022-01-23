package com.gamedoora.model.mapper;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdComment;
import com.gamedoora.model.dto.Comment;

@Mapper
public interface CommentMapper {

	Comment modelToDto(GdComment comment);

	GdComment dtoToModel(Comment comment);
}
