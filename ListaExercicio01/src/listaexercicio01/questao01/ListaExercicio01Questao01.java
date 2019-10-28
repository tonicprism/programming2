/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio01.questao01;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ListaExercicio01Questao01 {

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-------------------------------------------------");
        System.out.println("------------------------- QUESTÃO 1 -------------");
        Scanner scan = new Scanner(System.in);
        Estudante e = new Estudante();
        
        // Obtendo o nome
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        e.setNome(nome);
        System.out.println("-------------------------------------------------");
        // obtendo o endereço
        System.out.println("Qual o seu endereço? ");
        String ender = scan.nextLine();
        e.endereco = ender;
        System.out.println("-------------------------------------------------");
        // obtendo o número da matrícula
        System.out.println("Qual o número da sua matrícula? ");
        int matri = scan.nextInt();
        e.matricula = matri;
        System.out.println("-------------------------------------------------");
        // obtendo a primeira nota
        System.out.println("Digite sua primeira nota: ");
        float nota1 = scan.nextFloat();
        e.setNota1(nota1);
        System.out.println("-------------------------------------------------");
        // obtendo a segunda nota
        System.out.println("Digite sua segunda nota: ");
        float nota2 = scan.nextFloat();
        e.setNota2(nota2);
        System.out.println("-------------------------------------------------");
        // obtendo a terçeira nota
        System.out.println("Digite sua terceira nota: ");
        float nota3 = scan.nextFloat();
        e.setNota3(nota3);
        System.out.println("-------------------------------------------------");
        // obtendo a quarta nota
        System.out.println("Digite sua quarta nota: ");
        float nota4 = scan.nextFloat();
        e.setNota4(nota4);
        System.out.println("-------------------------------------------------");
        //calculando a média
        e.media(nota1, nota2, nota3, nota4);
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        
    }
    
}
