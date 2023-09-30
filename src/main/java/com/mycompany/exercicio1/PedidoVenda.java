package com.mycompany.exercicio1;

public class PedidoVenda extends Pedido {
    private double desconto;
    private double total;

    public PedidoVenda(int codigoPedido, double desconto) {
        super(codigoPedido);
        this.desconto = desconto;
        this.total = 0.0;
    }

    public void vender(double valorVenda) {
        setTotal(valorVenda - getDesconto());
    }

        public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo: Venda");
        System.out.println("Desconto: " + getDesconto());
        System.out.println("Total: " + getTotal());
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }
  
    public void setTotal(double total) {
        this.total = total;
    }
}
