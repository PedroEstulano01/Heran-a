package com.mycompany.bank;

public class ContaPoupança extends Conta{
    private double rendimento;
    
    
    public ContaPoupança(PessoaFisica cliente, String numeroConta, double rendimento ) {
        super(cliente, numeroConta);
        this.rendimento = 0.005;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
    public void rendimento() {
        this.saldo += this.saldo * this.rendimento;
    }
    
}
