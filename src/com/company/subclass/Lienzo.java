package com.company.subclass;

import com.company.Interfaces.Comunicacion;

public class Lienzo implements Comunicacion {
    public String tipoDeMaterial;
    public double medida;

    public Lienzo(String tipoDeMaterial, double medida) {
        this.tipoDeMaterial = tipoDeMaterial;
        this.medida= medida;
    }

    @Override
    public void billPay(String month) {

    }

    @Override
    public void applyDiscount() {

    }
}
