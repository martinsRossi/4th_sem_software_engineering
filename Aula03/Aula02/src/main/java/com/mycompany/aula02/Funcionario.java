package com.mycompany.aula02;

public class Funcionario {
    private String nome;
    private double salario;
    private Cracha umCracha;
    
    public Funcionario(String n, double s, Departamento d){
        nome = n;
        salario = s;
        umCracha = new Cracha(d);
    }
    
    public void mostrar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        getUmCracha().mostrar();
    }

    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public Cracha getUmCracha() {
        return umCracha;
    }


    public void setUmCracha(Cracha umCracha) {
        this.umCracha = umCracha;
    }
}
