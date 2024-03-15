package com.mycompany.aula02;

public class Cracha {
    private int id;
    private Departamento umDepto;
    
    public Cracha(Departamento d){
        umDepto = d;
        id = (int)Math.round(Math.random()*1000);
    }
    
    public void mostrar(){
        System.out.println("ID: " + getId());
        getUmDepto().mostrar();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Departamento getUmDepto() {
        return umDepto;
    }

    public void setUmDepto(Departamento umDepto) {
        this.umDepto = umDepto;
    }
}
    
