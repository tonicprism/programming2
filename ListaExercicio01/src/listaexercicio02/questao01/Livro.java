/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio02.questao01;

/**
 *
 * @author Gabriel
 */
public class Livro {
    String autor;
    String editora;
    String ISBN;
    String titulo;
    String anoDeEdicao;
    String[][] listaLivros = new String[3][10];
    /*
    public Livro
            (String autor, 
            String editora,
            String ISBN,
            String titulo,
            String anoDeEdicao,
            String[] listaLivros)
            {
                this.autor = autor;
                this.editora = editora;
                this.ISBN = ISBN;
                this.titulo = titulo;
                this.anoDeEdicao = anoDeEdicao;
                this.listaLivros = listaLivros;
            }
    */
    public void cadastrarLivro(int n){
        this.listaLivros[n][1] = this.autor;
        this.listaLivros[n][2] = this.titulo;
    }
    public String buscarLivroTitulo(String titulo){
        for(int i=0;i<this.listaLivros.length;i++){
            if(titulo.equals(this.listaLivros[i][1]) ){
                System.out.println("O livro "+listaLivros[i][1]+" foi encontrado");
            } else {
                System.out.println("Livro não encontrado");  
            }
        
        }
        return null;
     
    }
    public void listarLivrosPorAutor(String nomeAutor){
        System.out.println("");
    }
    public void listarTodosOsLivros(){
        for(int i=0;i<this.listaLivros.length;i++){
            for(int f =0;f<this.listaLivros.length;f++){
                System.out.println(this.listaLivros[i][f]);
            }
        }
    }
    
}
