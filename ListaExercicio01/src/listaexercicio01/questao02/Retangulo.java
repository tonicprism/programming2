/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio01.questao02;
/**
 *
 * @author Gabriel
 */
public class Retangulo {
   // estados 
    public int tamBase;
    public int tamAltura;
    
    // definindo os estados(construtor)
    public Retangulo(int tamBase, int tamAltura){
        this.tamBase = tamBase;
        this.tamAltura = tamAltura;
    }
    
    // método para calcular a área
    public int areaRet(){
        return (int) this.tamBase*this.tamAltura;
    }
    public int perimetroRet(){
        return (int) (this.tamBase*2) + (this.tamAltura*2) ;
    }
}
