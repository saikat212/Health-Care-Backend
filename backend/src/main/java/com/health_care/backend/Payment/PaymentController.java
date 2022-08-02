package com.health_care.backend.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PaymentController {
    @Autowired
    PaymentService service;

    @PostMapping("/save-payment")
    public Payment savePayment(@RequestBody Payment payment)
    {
        return service.savePayment(payment);
    } 

}
