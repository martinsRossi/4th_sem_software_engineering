package com.mycompany.aula02;

public class Aula02 {

    public static void main(String[] args) {
       Departamento d1, d2;
       d1 = new Departamento("RH", "Escritório");
       d2 = new Departamento("Produção", "Panelas");
       Gerente g1, g2;
       g1 = new Gerente("Mario Antunes", 10000, d1, 2000);
       g2 = new Gerente("Josias Santos", 8000, d2, 3000);
       
       Operador o1 = new Operador("Antonio Silva", 25, 180, d2);
       
       g1.mostrar();
       g2.mostrar();
       o1.mostrar();
       
       FolhaPagto folhaSet = new FolhaPagto();
       folhaSet.addSalario(g1);
       folhaSet.addSalario(g2);
       folhaSet.addSalario(o1);
       folhaSet.mostrar();
    }
}
