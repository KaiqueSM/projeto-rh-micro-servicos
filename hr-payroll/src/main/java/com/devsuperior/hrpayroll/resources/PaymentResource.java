package com.devsuperior.hrpayroll.resources;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping("/{workerId}/days/{days}")
    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    public ResponseEntity<Payment> getPayment(
            @PathVariable Long workerId,
            @PathVariable int days
    ){
        return ResponseEntity.ok(service.getPayment(workerId, days));
    }

    public ResponseEntity<Payment> getPaymentAlternative(
            Long workerId,
            int days
    ){
        return ResponseEntity.ok(new Payment("brann", 400.0, days));
    }
}
