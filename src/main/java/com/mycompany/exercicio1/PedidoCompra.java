package com.mycompany.exercicio1;

public class PedidoCompra extends Pedido {
     private int numeroParcelas;
    private double valorCompra;

    public PedidoCompra(int codigoPedido, int numeroParcelas) {
        super(codigoPedido);
        this.numeroParcelas = numeroParcelas;
        this.valorCompra = 0.0;
    }

    public void comprar(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo: Compra");
        System.out.println("Número de Parcelas: " + numeroParcelas);
        System.out.println("Valor da Compra: " + valorCompra);
        if (numeroParcelas > 0) {
            double valorParcela = valorCompra / numeroParcelas;
            System.out.println("Valor de cada Parcela: " + valorParcela);
        }
    }
}
