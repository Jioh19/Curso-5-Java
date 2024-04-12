package com.alkemy.wallet;


public class CuentaCorriente extends Cuenta{
    @Override
    public void depositar(double deposito) {
        saldo += deposito;
    }

    @Override
    public boolean retirar(double retiro) {
        if(saldo < retiro) {
            return false;
        }
        saldo -= retiro;
        return true;
    }
}
