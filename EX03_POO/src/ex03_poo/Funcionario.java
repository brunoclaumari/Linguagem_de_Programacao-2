/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03_poo;

/**
 *
 * @author BRUNOSILVA
 */
public class Funcionario {

    private int codigo;
    private String nome;
    private String rg;
    private double salario;
    private double inss;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the inss
     */
    public double getInss() {
        inss = salario * 0.11;
        return inss;
    }

    public double CalcularSalario() {
        return salario -= getInss();
    }

    @Override
    public String toString() {
        return "Código: " + this.getCodigo()
                + "\nNome: " + this.getNome()
                + "\nRG: " + this.getRg()
                + "\nSalario Bruto: " + this.getSalario()
                + "\nINSS: " + this.getInss()
                + "\nSalario Liquido: " + CalcularSalario();
    }

}
