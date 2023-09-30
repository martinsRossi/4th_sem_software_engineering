
package com.mycompany.exercicio1;

public class Circulo {
    private double raio;
    private double area;
    private static double PI = 3.1415;

    public Circulo(double raio) {
        this.raio = raio;
        calcularArea();
    }

    public void calcularArea() {
        this.setArea(getPI() * getRaio() * getRaio());
    }

    public void mostrarDados() {
        System.out.println("Raio do Círculo: " + getRaio());
        System.out.println("Área do Círculo: " + getArea());
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        circulo.mostrarDados();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
 
    public double getArea() {
        return area;
    }
 
    public void setArea(double area) {
        this.area = area;
    }
  
    public static double getPI() {
        return PI;
    }

       public static void setPI(double aPI) {
        PI = aPI;
    }
    
}
