package com.mycompany.bank;

public class PessoaFisica extends Cliente {
    private String cpf; 

    public PessoaFisica (String cpf, String nome, String telefone){
        super(nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    
  
    
    
            
    
}
