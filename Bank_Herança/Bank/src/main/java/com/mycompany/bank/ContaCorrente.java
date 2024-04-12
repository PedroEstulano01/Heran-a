
package com.mycompany.bank;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(PessoaFisica cliente, String numeroConta) {
        super(cliente, numeroConta);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: O saldo não pode ser negativo.");
        }
    }

    
}
