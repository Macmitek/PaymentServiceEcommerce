package com.example.paymentserviceecommerce.services;


import com.example.paymentserviceecommerce.paymentgateways.PaymentGateway;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGateway paymentGateway;

    PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String createPaymentLink(Long orderId) throws RazorpayException, StripeException {
        //call the Razorpay/Stripe PG to generate the payment link.
        return paymentGateway.createPaymentLink(orderId);
    }
}