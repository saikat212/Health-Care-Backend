package com.health_care.backend.Notification;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Integer>{

    List<Notification> findByReceiverId(Integer id);
    
}
