/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio01.questao01;

/**
 *
 * @author Gabriel
 */
public class Estudante {
    // estados
    private String nome;
    int matricula;
    String endereco;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    
    /*Criando getters e setters*/
    // get nome
    public String getNome(){
        return nome;
    }
    // set nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // getters e setters das notas
    public float getNota1(){
        return nota1;
    } public void setNota1(float nota1){
        this.nota1 = nota1;
    }
    
    public float getNota2(){
        return nota2;
    } public void setNota2(float nota2){
        this.nota2 = nota2;
    }
    
    public float getNota3(){
        return nota3;
    } public void setNota3(float nota3){
        this.nota3 = nota3;
    }
    
    public float getNota4(){
        return nota4;
    } public void setNota4(float nota4){
        this.nota4 = nota4;
    }
    
    // método para calcular a média
    public void media(float nota1,float nota2, float nota3, float nota4){
        float mediaVal = ((nota1+nota2+nota3+nota4)/4);
        System.out.println("Sua média foi: "+mediaVal);
        if(mediaVal >= 7){
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você está reprovado!");
        }
    }
    
}

