/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula01;

/**
 *
 * @author Anchieta
 */

//Declarar os atributos
//Temos dois objetos (ra e nome)
public class Aluno {
    int ra; 
    String nome;
    
    //Procedures(métodos)
    //Temos dois métodos (cadastrar e mostrar)
    void cadastrar(int umRa, String umNome) {
        ra = umRa;
        nome = umNome;
    }
    
    
    void mostrar () {
        System.out.println("Ra: " + ra);
        System.out.println("Nome: " + nome);
    }

    
}
