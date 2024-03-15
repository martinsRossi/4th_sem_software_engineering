package com.mycompany.aula02;

public class Operador extends Funcionario {
    private double valorHoras;
    private double totalHoras;
    
    public Operador(String n, double nh, double th, Departamento d){
        super(n, (nh*th), d);
        valorHoras = nh;
        totalHoras = th;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Valor hora: " + getValorHoras());
        System.out.println("Total de Horas:" + getTotalHoras());
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(double totalHoras) {
        this.totalHoras = totalHoras;
    }
    
}
