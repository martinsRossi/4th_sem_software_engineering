/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula01;

/**
 *
 * @author Anchieta
 */
public final class AlunoPes extends Aluno {
   private double bolsa;
    
    public AlunoPes(int ra, String nome, double bolsa){
        super(ra, nome); // Para construtor, não precisa nomear. Só colocar super.
        setBolsa(bolsa);
   
    }

    public void mostrar(){
        super.mostrar(); // Já para métodos, é preciso nomeá-lo.
        System.out.println("Bolsa: " + getBolsa());
        
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}  

