package com.company.subclass;

import com.company.superclass.CanastaBasica;
import com.company.superclass.CanastaNoBasica;

import java.util.Date;

public class Vino extends CanastaNoBasica {
    private int añejamiento;

    //constructor
    public Vino(String identificador, String nombre, double costo, Date fechaDeVencimiento, boolean canastaBasica, int aniejamiento) {
        super(identificador, nombre, costo, fechaDeVencimiento, canastaBasica);
        this.añejamiento = aniejamiento;
    }

    public int getAniejamiento() {
        return añejamiento;
    }

    @Override
    public double ObtenerPrecio() {
        double precioFinal = super.ObtenerPrecio();
        int multiplicador = calcularMultiplicador();

        return precioFinal + (precioFinal * (multiplicador / 10));
    }

    private int calcularMultiplicador() {
        return añejamiento / 5;
    }

}
