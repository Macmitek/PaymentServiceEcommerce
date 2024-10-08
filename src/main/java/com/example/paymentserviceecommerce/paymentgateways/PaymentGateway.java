package com.example.paymentserviceecommerce.paymentgateways;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String createPaymentLink(Long orderId) throws RazorpayException, StripeException;
}