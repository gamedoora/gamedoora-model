package com.gamedoora.model.mapper;

import java.util.Collection;
import java.util.List;

import org.mapstruct.Mapper;

import com.gamedoora.model.dao.GdNotification;
import com.gamedoora.model.dto.Notification;

@Mapper
abstract class NotificationMapper {
	public Notification modelToNotificationDTO(GdNotification gdNotification) {
		Notification notificationDTO = new Notification();
		notificationDTO.setActionUrl(gdNotification.getActionUrl());
		return notificationDTO;
	}

	public abstract List<Notification> modelToNotificationsDTO(Collection<Notification> notification);

	public abstract GdNotification dtoToModel(Notification notification);

}
