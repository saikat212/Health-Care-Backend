package com.health_care.backend.Taker;

import com.health_care.backend.TakerSpeciality.TakerSpeciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TakerRepository extends JpaRepository<Taker,Integer> {
}
