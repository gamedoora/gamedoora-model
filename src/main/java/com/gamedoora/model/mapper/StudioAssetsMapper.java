package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdStudioAsset;
import com.gamedoora.model.dto.StudioAssets;

@Mapper
public interface StudioAssetsMapper {
	StudioAssets modelToDto(GdStudioAsset project);

	GdStudioAsset dtoToModel(StudioAssets project);

	Map<String, Object> map(Map<String, Object> additionalProperties);

	List<StudioAssets> modelToNotificationsDTO(Collection<StudioAssets> project);

}
