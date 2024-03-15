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
        Aluno aluno01 = new Aluno(1020, "José Ferreira");
        Aluno aluno02 = new Aluno(2233, "Maria Joaquina");
        AlunoPes aluno03 = new AlunoPes(2234, "Maria Pupila", 1650.49);
        
        aluno01.mostrar();
        aluno02.mostrar();
        aluno03.mostrar();
    }
}
