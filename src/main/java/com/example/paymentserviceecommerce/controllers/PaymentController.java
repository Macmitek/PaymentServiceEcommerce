package com.example.paymentserviceecommerce.controllers;


import com.example.paymentserviceecommerce.dtos.CreatePaymentLinkRequestDto;
import com.example.paymentserviceecommerce.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String createPaymentLink(@RequestBody CreatePaymentLinkRequestDto requestDto) {
        String payment = null;
        try {
            payment = paymentService.createPaymentLink(requestDto.getOrderId());
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }

        return payment;
    }

}