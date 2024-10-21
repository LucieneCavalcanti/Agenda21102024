package br.edu.fatecriopreto.projetoagenda.model;

import java.sql.Timestamp;

public class Agenda {
    private Timestamp datahora;
    private Cliente cliente;
    private Funcionario funcionario;
    private Servico servico;
    public Agenda() {
        datahora = new Timestamp(0);
        cliente = new Cliente();
        funcionario = new Funcionario();
        servico = new Servico();
    }
    public Agenda(Timestamp datahora, Cliente cliente, Funcionario funcionario, Servico servico) {
        this.datahora = datahora;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.servico = servico;
    }
    public Timestamp getDatahora() {
        return datahora;
    }
    public void setDatahora(Timestamp datahora) {
        this.datahora = datahora;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Servico getServico() {
        return servico;
    }
    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
}
