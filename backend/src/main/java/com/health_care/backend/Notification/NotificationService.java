package com.health_care.backend.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository repository;

    public Notification saveNotification(Notification notification){
        return repository.save(notification);
    }
    public Notification getNotificationById(Integer id){
        return repository.findById(id).orElse(null);
    }
}
