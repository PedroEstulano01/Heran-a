package com.mycompany.bank;

public class ContaEmpresarial extends Conta {
    private double chequeEspecial;

    public ContaEmpresarial(PessoaJuridica cliente, String numeroConta, double chequeEspecial) {
        super(cliente, numeroConta);
        this.chequeEspecial = 6.000;
    }   

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
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
    
    

