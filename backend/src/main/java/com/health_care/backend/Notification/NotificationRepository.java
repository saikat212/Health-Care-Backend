package com.health_care.backend.Notification;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

    @Query(value = "select * from notification" +
            " where receiver_id = :id and status = 'pending'", nativeQuery = true)
    List<Notification> findByReceiverId(@Param("id") Integer id);
    
    @Modifying
    @Transactional
    @Query(value = "update notification set status ='placed' where receiver_id = :id ",nativeQuery = true)
    void changeStatus(@Param("id") Integer id);

}
