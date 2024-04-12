package com.alkemy.wallet;

import java.util.ArrayList;

public abstract class Cuenta {

    protected double numCuenta;
    protected double saldo;
    protected ArrayList<Transaccion> transacciones;

   public abstract void depositar(double deposito);
   public abstract boolean retirar(double retiro);

    public double getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void addTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }
}
