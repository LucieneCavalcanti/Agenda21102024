package br.edu.fatecriopreto.projetoagenda.model;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente() {
        super();//construtor sem parametros de Pessoa
        cpf = new String();
    }

    public Cliente(int id, String nome, String email, String senha, String cpf) {
        super(id, nome, email, senha);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
