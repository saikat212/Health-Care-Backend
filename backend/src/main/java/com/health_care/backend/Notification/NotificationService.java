package com.health_care.backend.Notification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository repository;

    public Notification saveNotification(Notification notification){
        return repository.save(notification);
    }
    public List<Notification> getNotificationById(Integer id){
        return repository.findByReceiverId(id);
    }
    public void changeStatus(Integer id){
        System.out.println("Id: "+id);
        repository.changeStatus(id);
    }
}
