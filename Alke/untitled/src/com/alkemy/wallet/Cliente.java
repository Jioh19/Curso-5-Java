package com.alkemy.wallet;


import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String apellido;
    private int rut;
    ArrayList<Cuenta> cuentas;


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getRut() {
        return rut;
    }
}
