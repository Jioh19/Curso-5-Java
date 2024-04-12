package com.alkemy.wallet;

public class Transaccion {

    private Cuenta origen;
    private Cuenta destino;
    private double monto;

    public Transaccion(Cuenta origen, Cuenta destino, double monto) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
    }

    public boolean realizarTransaccion() {
        if(origen.getSaldo() < monto) {
            return false;
        }
        origen.retirar(monto);
        destino.depositar(monto);
        origen.addTransaccion(this);
        destino.addTransaccion(this);
        return true;
    }
}
