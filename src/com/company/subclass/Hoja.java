package com.company.subclass;

import com.company.Interfaces.Comunicacion;

public class Hoja implements Comunicacion {

    public String tipoDeHoja;
    public boolean esRecicado;

    public Hoja(String tipoDeHoja) {
        this.tipoDeHoja = tipoDeHoja;
    }

    @Override
    public void billPay(String month) {

    }

    @Override
    public void applyDiscount() {

    }
}
