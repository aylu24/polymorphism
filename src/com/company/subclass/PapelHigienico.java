package com.company.subclass;

import com.company.superclass.CanastaNoBasica;

import java.util.Date;

public class PapelHigienico extends CanastaNoBasica {
    private boolean esDobleHoja;

    public PapelHigienico(String identificador, String nombre, double costo, Date fechaDeVencimiento, boolean canastaBasica,
                          boolean esDobleHoja) {
        super(identificador, nombre, costo, fechaDeVencimiento, canastaBasica);
        this.esDobleHoja = esDobleHoja;
    }
    @Override
    public double ObtenerPrecio() {
        double precioPapel = (costo * GANANCIA) + (costo * IVA);

        if (esDobleHoja == true) {
            precioPapel += precioPapel * 0.35;
            //precioPapel = precioPapel + precioPapel * 0.05;
        }
        return precioPapel;
    }
}
