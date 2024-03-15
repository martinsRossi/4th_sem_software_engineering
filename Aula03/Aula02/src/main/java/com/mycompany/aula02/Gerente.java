package com.mycompany.aula02;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String n, double s, Departamento d, double b){
        super(n, (s+b), d);
        bonus = b;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Bonus: " + getBonus());
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
