package com.mycompany.exercicio1;

public class Aluno {
    private int ra;
    private String nome;
    private String sexo;
    private Data dtNascimento;

    public void cadastrar(int umRa, String umNome, String umSexo, Data umaData) {
        setRa(umRa);
        setNome(umNome);
        setSexo(umSexo);
        setDtNascimento(umaData);
    }

    public void mostrar() {
        System.out.println("RA: " + getRa());
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.print("Data de Nascimento: ");
        if (getDtNascimento() != null) {
            getDtNascimento().verData();
        } else {
            System.out.println("Não especificada");
        }
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Data getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Data dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}