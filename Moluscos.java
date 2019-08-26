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
public class Moluscos extends Invertebrados{

    public Moluscos(String nome, String ondeVive, String dieta, String pele) {
        super(nome, ondeVive, dieta, pele);
    }
    public void caçar()
    {
	System.out.println(nome+" está caçando...");
    }
    public void caminhando()
        {
            System.out.println(nome+" está caminhando...");
        }
    public void dormindo()
        {
            System.out.println(nome+" está dormindo...ZZZZZZZZ");
        }
    public void seAlimentar()
        {
            System.out.println(nome+" está se alimentando...");
        }
}
