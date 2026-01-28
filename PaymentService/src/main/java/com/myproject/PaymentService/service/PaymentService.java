package com.myproject.PaymentService.service;

import com.myproject.PaymentService.model.PaymentRequest;
import com.myproject.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
