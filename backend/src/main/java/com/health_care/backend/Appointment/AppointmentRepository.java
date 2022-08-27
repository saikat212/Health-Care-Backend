package com.health_care.backend.Appointment;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

    @Query(value="select * from appointment"+
    " where doctor_id = :id and status = :str ",nativeQuery=true)
    List<Appointment> findAppointments(@Param("id") Integer id, @Param("str") String str);
    @Modifying
    @Transactional
    @Query(value = "update appointment "+ 
    "set status = :status, "+
    "date_given_by_doctor = :dateGivenByDoctor, "+
    "comment_from_doctor = :commentFromDoctor "+
    "where id = :i",nativeQuery = true)
    void updateAppoinment(Date dateGivenByDoctor, String commentFromDoctor, String status, int i);

    @Query(value="select * from appointment"+
    " where doctor_id = :id and status = 'pending'",nativeQuery=true)
    List<Appointment> getPendingAppointments();
    @Modifying
    @Transactional
    @Query(value = "update appointment "+ 
    "set prescription_id = :pid "+
    "where id = :id",nativeQuery = true)
    void updatePrescriptionId(@Param("id") Integer id,@Param("pid") Integer pid);

    @Query(value="select * from appointment"+
    " where patient_id = :id and status = 'closed' ",nativeQuery=true)
    List<Appointment> findByPatientId(Integer id);
    
}
