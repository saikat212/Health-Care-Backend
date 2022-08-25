package com.health_care.backend.Notification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @Autowired
    private NotificationService service;

    @PostMapping("/save-notification")
    public Notification saveNotification(@RequestBody Notification notification){
        return service.saveNotification(notification);
    }
    @GetMapping("/get-all-notification/{id}")
    public List<Notification> getNotificationById(@PathVariable Integer id){
        return service.getNotificationById(id);
    }
    @PostMapping("/change-status/{id}")
    public void changeStatus(@PathVariable("id") Integer id){
        service.changeStatus(id);
    }

}
