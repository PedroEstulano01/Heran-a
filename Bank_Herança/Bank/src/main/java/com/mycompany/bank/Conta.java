package com.mycompany.bank;

public class Conta{
    private Cliente cliente;
    protected String numeroConta;
    protected double saldo;
    
     public  Conta(Cliente cliente, String numeroConta){
         this.cliente = cliente; 
         this.numeroConta = numeroConta;
         this.saldo = 0;
     }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     public void depositar (double valor){
         this.saldo += valor;
     }
     
     public void sacar (double valor){
         if(this.saldo >= valor){
             this.saldo -= valor;
             System.out.println("Valor foi sacado corretamente.");
         }
         System.out.println("Saque não realizado: Valor do saque maior do que o saldo.");
     }
     
     
}

