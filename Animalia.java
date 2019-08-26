/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author Luiz
 */
public abstract class Animalia {
    public String nome;
    public String ondeVive;
    public String dieta;
    public String pele;
    public Animalia(String nome, String ondeVive, String dieta, String pele)
    {
        this.nome = nome;
        this.ondeVive = ondeVive;
        this.dieta = dieta;
        this.pele = pele;
    }
}
