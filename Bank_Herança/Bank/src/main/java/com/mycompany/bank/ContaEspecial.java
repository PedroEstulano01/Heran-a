package com.mycompany.bank;

public class ContaEspecial extends Conta {
    private double chequeEspecial;
    

    
    public ContaEspecial(PessoaFisica cliente, String numeroConta, double chequeEspecial) {
        super(cliente, numeroConta); 
        this.chequeEspecial = 850.00;
    }
    
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String getNumeroConta() {
        return numeroConta;
    }

    @Override
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }   
    
    @Override
    public void sacar(double valor) {
        double limiteDisponivel = this.chequeEspecial + this.saldo;
        if (limiteDisponivel >= valor) {
            this.saldo -= valor; // Subtrai o valor do saque diretamente do saldo
        } else {
            System.out.println("Saldo e cheque especial insuficiente!");
        }
    }
}

    
