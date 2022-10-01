package com.company.Interfaces;

public interface Comunicacion {
    static final String NAME  = "Movistar";
    static final double DISCOUNT = 0.05;

    void billPay(String month);
    void applyDiscount();
}
