/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio01.questao03;

/**
 *
 * @author Gabriel
 */
public class Circulo {
    // estados 
    public int raio;
    float pi = (float) Math.PI;
    
    // definindo os estados(construtor)
    public Circulo(int raio){
       this.raio = raio;
    }
    
    // método para calcular a área
    public float areaCircu(){
        return (float) (Math.pow(this.raio, 2)*this.pi);
    }
    public float perimetroCircu(){
        return (float) (2*this.pi*this.raio) ;
    }
}
