
package com.mycompany.aula02;


public class Departamento {
    private String nome;
    private String setor;
    
    public Departamento(String n, String s){
        nome = n;
        setor = s;
       
    }
    
    public void mostrar(){
        System.out.println("Depto: " + getNome());
        System.out.println("Setor: " + getSetor());
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getSetor() {
        return setor;
    }

  
    public void setSetor(String setor) {
        this.setor = setor;
    }
}

