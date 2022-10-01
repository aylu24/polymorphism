package com.company.subclass;

import com.company.superclass.CanastaNoBasica;

import java.util.Date;

public class Cerveza extends CanastaNoBasica {
    private String tipo;
    private double volAlcohol;
    private boolean deHeladera;

    public Cerveza(String identificador, String nombre, double costo, Date fechaDeVencimiento, boolean canastaBasica,
     String tipo, double volAlcohol, boolean deHeladera) {
        super(identificador, nombre, costo, fechaDeVencimiento, canastaBasica);
        this.tipo= tipo;
        this.volAlcohol=  volAlcohol;
        this.deHeladera= deHeladera;

    }

    public String getTipo() {
        return tipo;
    }

    public double getVolAlcohol() {
        return volAlcohol;
    }

    public boolean isDeHeladera() {
        return deHeladera;
    }

    public double ObtenerPrecio() {
        double precioCerveza = (costo * GANANCIA) + (costo * IVA);

        if (deHeladera == true) {
            precioCerveza += precioCerveza * 0.05;
            //precioCerveza = precioCerveza + precioCerveza * 0.05;
        }
        return precioCerveza;

    }
}
