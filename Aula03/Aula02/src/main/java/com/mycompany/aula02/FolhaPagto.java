
package com.mycompany.aula02;


public class FolhaPagto {
    private double totalFolha;

    public FolhaPagto(){
    totalFolha = 0;
    }
    
    public void addSalario(Funcionario umFunc){
        setTotalFolha(getTotalFolha() + umFunc.getSalario());
    }
    
    public void mostrar (){
        System.out.println("TOTAL FOLHA = " + getTotalFolha());
    }

    public double getTotalFolha() {
        return totalFolha;
    }

    public void setTotalFolha(double totalFolha) {
        this.totalFolha = totalFolha;
    }
}
