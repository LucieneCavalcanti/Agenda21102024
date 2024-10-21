package br.edu.fatecriopreto.projetoagenda.model;

public class Departamento {
    private int id;
    private String descricao;
    public Departamento() {
    }
    public Departamento(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
