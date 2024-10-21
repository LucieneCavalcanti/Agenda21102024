package br.edu.fatecriopreto.projetoagenda.model;

public class Funcionario extends Pessoa{
    private float salario;
    private Departamento departamento;

    public Funcionario() {
        super();
        salario = 0;
        departamento = new Departamento();
    }

    public Funcionario(int id, String nome, String email, String senha, float salario, Departamento departamento) {
        super(id, nome, email, senha);
        this.salario = salario;
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
}
