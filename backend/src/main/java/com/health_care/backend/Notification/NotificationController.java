package com.health_care.backend.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @Autowired
    private NotificationService service;

    @PostMapping("/save-notification")
    public Notification saveNotification(@RequestBody Notification notification){
        return service.saveNotification(notification);
    }
    @GetMapping("/get-notificationById/{id}")
    public Notification getNotificationById(@PathVariable Integer id){
        return service.getNotificationById(id);
    }
}
