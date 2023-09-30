package com.mycompany.exercicio1;

public class Quadrado {
    private double lado;
    private double area;

    public Quadrado(double lado) {
        this.lado = lado;
        calcularArea();
    }

    public void calcularArea() {
        this.setArea(getLado() * getLado());
    }

    public void mostrarDados() {
        System.out.println("Lado do Quadrado: " + getLado());
        System.out.println("Área do Quadrado: " + getArea());
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5.0);
        quadrado.mostrarDados();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
}


