package com.mycompany.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Exercicio 1 e 2\n");
        Data data1 = new Data(30, 9, 2023);
        Data data2 = new Data(15, 12, 2024);
        Data data3 = new Data(5, 7, 2022);
        
        System.out.println("Data 1:");
        data1.verData();

        System.out.println("\nData 2:");
        data2.verData();

        System.out.println("\nData 3:");
        data3.verData();
        
        System.out.println("\nExercicio 3 e 4\n");
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();

        aluno01.cadastrar(1020, "José Ferreira", "Masculino", new Data(30, 1, 1943));
        aluno02.cadastrar(2233, "Maria Joaquina", "Feminino", new Data(04,8,1968));

        aluno01.mostrar();
        aluno02.mostrar();
              
        
        System.out.println("\nExercicio 5 e 6\n");
        Pessoa umaPessoa = new Pessoa("Alice Martins", "Rua João Meneguel Soares, 123", "Feminino", 25);
        Pessoa outraPessoa = new Pessoa("Hermido Velasquez", "Avenida dos Goitacazes, 456", "Masculino", 73);
        Pessoa pupilo = new Pessoa("Carolina Menezes", "Rua Orlinda da Silva Sauro, 789", "Feminino", 18);
        
        System.out.println("Dados da Pessoa numero 1 (umaPessoa):");
        umaPessoa.mostrarDados();

        System.out.println("\nDados da Pessoa numero 2 (outraPessoa):");
        outraPessoa.mostrarDados();

        System.out.println("\nDados da Pessoa numero 3 (pupilo):");
        pupilo.mostrarDados();
        
        System.out.println("\nExercicio 7\n");
        Quadrado quadrado = new Quadrado(5.0);
        quadrado.calcularArea();
        quadrado.mostrarDados();
        
        System.out.println("\nExercicio 8\n");
        Quadrado umQuadrado = new Quadrado(7.5);
        Quadrado outraQuadrado = new Quadrado(17.9);
        Quadrado frame = new Quadrado(0.95);

        System.out.println("Dados umQuadrado:");
        umQuadrado.mostrarDados();

        System.out.println("\nDados outraQuadrado:");
        outraQuadrado.mostrarDados();

        System.out.println("\nDados frame:");
        frame.mostrarDados();
        
        System.out.println("\nExercicio 9\n");
        Circulo circulo = new Circulo(5.0);

        circulo.mostrarDados();
        
        System.out.println("\nExercicio 10\n");
        Circulo umaBola = new Circulo(10.5);
        Circulo outraBola = new Circulo(17.7);
        Circulo cafusa = new Circulo(52.1);

      
        System.out.println("Dados umaBola:");
        umaBola.mostrarDados();

        System.out.println("\nDados outraBola:");
        outraBola.mostrarDados();

        System.out.println("\nDados cafusa:");
        cafusa.mostrarDados();
        
        
        System.out.println("\nExercicio 11\n");
        PedidoVenda pedidoVenda = new PedidoVenda(49, 15.0);
        pedidoVenda.vender(524.0);

        PedidoCompra pedidoCompra = new PedidoCompra(134, 6);
        pedidoCompra.comprar(33400.5);

        pedidoVenda.mostrarDados();
        System.out.println("\n");
        pedidoCompra.mostrarDados();
        
        System.out.println("\nExemplo 12\n");

        PedidoVenda pedidoVenda1 = new PedidoVenda(134, 25.0);
        pedidoVenda1.vender(4230.0);

        // Criar um pedido de compra com código 202 e 10 parcelas
        PedidoCompra pedidoCompra1 = new PedidoCompra(202, 15);
        pedidoCompra1.comprar(89240.0);

        // Mostrar os detalhes dos pedidos
        System.out.println("Detalhes do Pedido de Venda:");
        pedidoVenda1.mostrarDados();
        System.out.println("\nDetalhes do Pedido de Compra:");
        pedidoCompra1.mostrarDados();
    }
}