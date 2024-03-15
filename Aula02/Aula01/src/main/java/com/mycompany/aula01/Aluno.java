package com.mycompany.aula01;

//Declarar os atributos
//Temos dois objetos (ra e nome)
public class Aluno {
    private int ra; 
    private String nome;
    
    
    public Aluno(int ra, String nome){ //Construtor
        cadastrar(ra, nome);
 
    }
    
    //Procedures(métodos)
    //Temos dois métodos (cadastrar e mostrar)
    void cadastrar(int umRa, String umNome) {
        setRa(umRa);
        setNome(umNome);
    }
    
    
    void mostrar () {
        System.out.println("Ra: " + getRa());
        System.out.println("Nome: " + getNome());
    }


    public int getRa() {
        return ra;
    }


    public void setRa(int ra) {
        this.ra = ra;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    static class java {

        public java() {
        }
    }

    
}

