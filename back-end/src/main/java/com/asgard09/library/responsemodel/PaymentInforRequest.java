package com.asgard09.library.responsemodel;

import lombok.Data;

@Data
public class PaymentInforRequest {

    private int amount;
    private String currency;
    private String receiptEmail;
}
