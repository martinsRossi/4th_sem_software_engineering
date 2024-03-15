/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula01;

/**
 *
 * @author Anchieta
 */
public class Aula01 {

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();
        
        aluno01.cadastrar(1020, "José Ferreira");
        aluno02.cadastrar(2233, "Maria Joaquina");
        
        aluno01.mostrar();
        aluno02.mostrar();
    }
}
