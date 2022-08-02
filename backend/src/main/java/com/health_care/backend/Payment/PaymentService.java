package com.health_care.backend.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository repository;

   
    public Payment savePayment(Payment payment){
        return repository.save(payment);
    }
}
