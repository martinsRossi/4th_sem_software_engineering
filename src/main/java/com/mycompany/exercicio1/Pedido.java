package com.mycompany.exercicio1;

public class Pedido {
private int codigoPedido;

    public Pedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public void mostrarDados() {
        System.out.println("Código do Pedido: " + getCodigoPedido());
    }    
    
    public int getCodigoPedido() {
        return codigoPedido;
    }

  
    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }
}
