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
public class Ex03 {
    public static void main(String[] args){
        /*Objetos Vertebrados*/
        // Objeto da Classe Vertebrado
        Mamífero mam = new Mamífero("Leão", "Selva","carnivoro","pelagem-baixa");
        // métodos da interface SerAnimal() implementada na classe Abstrata Animalia
        System.out.println("");
        System.out.println("!!! OBJETOS VERTEBRADOS !!!");
        System.out.println("");
        mam.caçar();
        mam.caminhando();
        mam.dormindo();
        mam.seAlimentar();
        
        // Objeto da Classe Vertebrado
        Peixes pei = new Peixes("Tubarão", "oceanos", "canívoros(peixes menores)","microscópicas escamas com arestas, chamadas dentículos" );
        // métodos da interface SerAnimal() implementada na classe Abstrata Animalia
        System.out.println("-----------------------------------------");
        pei.caçar();
        pei.caminhando();
        pei.dormindo();
        pei.seAlimentar();
        
        // Objeto da Classe Vertebrado
        Anfibios anf = new Anfibios("Sapo","Ambientes úmidos","carnívoro(insetos)","pele rugosa com glândulas parotoides");
        // métodos da interface SerAnimal() implementada na classe Abstrata Animalia
        System.out.println("-----------------------------------------");
        anf.caçar();
        anf.caminhando();
        anf.dormindo();
        anf.seAlimentar();
        
        // Objeto da Classe Vertebrado
        Répteis rep = new Répteis("tartaruga","oceanos","onívora","pele seca/parte óssea(carapaça)");
        // métodos da interface SerAnimal() implementada na classe Abstrata Animalia
        System.out.println("-----------------------------------------");
        rep.caçar();
        rep.caminhando();
        rep.dormindo();
        rep.seAlimentar();
        
        // Objeto da Classe Vertebrado
        Aves ave = new Aves("galinha","florestas/fazendas","hebívoras-frutas e grãos","pena");
        // métodos da interface SerAnimal() implementada na classe Abstrata Animalia
        System.out.println("-----------------------------------------");
        ave.caçar();
        ave.caminhando();
        ave.dormindo();
        ave.seAlimentar();
        System.out.println("");
        System.out.println("------------- FIM ---------------");
        System.out.println("");
        /*Objetos Invertebrados*/
        // Objeto da Classe invertebrado  
        Cnidários cni = new Cnidários("Água-viva","Oceanos","carnívora","nematocistos em sua pele que utilizam para capturar e matar os alimentos");
        // métodos da interface SerAnimal() implementada na classe Abstrata Animalia
        System.out.println("!!! OBJETOS INVERTEBRADOS !!!");
        System.out.println("");
        cni.caçar();
        cni.caminhando();
        cni.dormindo();
        cni.seAlimentar();
    }
}
