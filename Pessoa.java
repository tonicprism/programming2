/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoa;

/**
 *
 * @author Luiz
 */
public class Pessoa {
    // Estados/propriedade;
    private String nome;
    private String gênero;
    public String cor_olhos;
    public  String étnia;
    public String nacionalidade;
    public String data_de_nascimento;
    public float peso;
    public int idade;
    public float altura;
    public String ocupação;
    public String descrição;
    
    
    // Métodos
    // Método andar
    public static void andar(String nome){
        if (nome == "Homer Simpson"){
            System.out.println("Homer não consegue andar sem cabalear por causa da bebida");
        } else {
            System.out.println(nome + " está andando" );
        };
    };
    // Método correr;
    public static void correr(String nome){
        if (nome == "Rocky" || nome == "Rocky Balboa"){
            System.out.println("O Rocky está correndo nas escadas de Filadélfia...");}
        else if (nome == "Homer" || nome == "Homer Simpson"){
            System.out.println("O Hommer não corre porque ele está bêbado demais para isso...");}
        else if (nome == "Natasha" || nome == "Natasha Romanova" || nome == " Наталья Альяновн аНаташа Романова"){
            System.out.println("A Natasha está correndo atrás do agente inimigo...");}
        else if (nome == "Lara" || nome == "Lara Croft"){
            System.out.println("A Lara está correndo da depois de ter saqueado uma Tumba...");}
        else {
            System.out.println(nome + " está correndo");}
    };
    // Método nadar;
    public static void nadar(String nome){
        System.out.println(nome + " está nadando");
    };
    // Método comer;
    public static void comer(String nome){
        if (nome == "Homer" ||nome == "Homer Simpson") {
            System.out.println("Homer está comendo as suas rosquinhas...");
        }
        else if (nome == "Natasha" || nome == "Natasha Romanova") {
            System.out.println("Natasha está comendo Salada de Arenque...");
        }
        else if (nome == "Lara Croft" || nome == "Lara"){
            System.out.println("Lara está comendo Fish and Chips...");
        }
        else if (nome == "Rocky Balboa" || nome == "Rocky"){
            System.out.println("Rocky está comendo ovo...");
        }
        else {
            System.out.println(nome + " está comendo...");
        };
    };
    // Método beber;
    public static void beber(String nome, int idade) {
        if (nome == "Rocky" || nome == "Rocky Balboa") {
            System.out.println("Rocky está bebendo a gema de ovo da vitória...");
        }
        else if (nome == "Natasha" || nome == "Natasha Romanova") {
            System.out.println("Natasha está bebendo uma vodka, no frio russo...");
        }
        else if (nome == "Lara" || nome == "Lara Croft") {
            System.out.println("Lara está bebendo um chá, no seu descanso da tarde...");
        }
        else if (nome == "Homer" || nome == "Homer Simpson") {
            System.out.println("Homer está bebendo sua cerveja Duff...");
        }
        if (idade < 18){
            System.out.print("Você só vai beber água ou refrigerante, por ser menor de idade.");
        }
        else {
            System.out.println("Você pode beber o que você quiser; Você é maior de idade.");
        }
    };
    // Método piscar;
    public static void piscar(String nome){
        if (nome == "Rocky" || nome == "Rocky Balboa"){
            System.out.println("O Rocky tem um pouco de dificuldade em fazer isso porque\n, geralmente, ele está muito machucado na área dos olhos...");
        }
        else if (nome == "Natasha" || nome == "Natasha Romanova"){
            System.out.println("Uma piscada dessa mulher é fatal para qualquer ser vivo...");
        }
        else {
            System.out.println(nome + " piscando...");
        }
    };
    // Método respirar;
    public static void respirar(String nome){
        if (nome == "Homer" || nome == "Homer Simpson") {
            System.out.println("O Homer respira com um pouco de dificuldade por causa da obesidade...");
        }
        else {
            System.out.println(nome + " está respirando");
        };
    };
    // Método lutar;
    public static void lutar(String nome) {
        if (nome == "Rocky Balboa" || nome == "Rocky"){
            System.out.println("O Rocky até tenta lutar, mas o problema é que ele fica bastante tempo no chão...");
        }
        else if (nome == "Natasha Romanova" || nome == "Natasha") {
            System.out.println("Ela é uma otima lutadora! Aprendeu com os melhores na sala vermelha.");
        }
        else if (nome == "Lara Croft" || nome == "Lara") {
            System.out.println("Ela é uma ótima lutadora! Aprendeu com os melhores lutadores que o dinheiro podia pagar.");
        }
        else if (nome == "Homer" || nome == "Homer Simpson") {
            System.out.println("A única luta diária do Homer é para parar de beber e de estrangular o Bart");
        }
        else if (nome == "Luiz Gustavo"){
            System.out.println("A única luta diária do Aluno é tentar aprender os assuntos da escola\n e tirar notas boas");
        }
        else if (nome == "Charles Xavier"){
            System.out.println("A única luta diária do aluno é tentar fazer o aluno estudar\n e prestar atenção na aula");
        }
        else {
            System.out.println(nome + " está lutando...");
        }
    };
    // Método dançar;
    public static void dançar(String nome){
        if(nome == "Natasha Romanova"){
            System.out.println("Natasha é uma bailarina tão habilidosa quanto assassina...");
        }
        else if(nome == "Lara Croft"){
            System.out.println("Lara é uma otima dançarina...");
        }
        else if (nome == "Rocky Balboa"){
            System.out.println("A única dança que importa para o Rocky é a dança que rola no ringue...");
        }
        else if(nome == "Homer Simpson"){
            System.out.println("Homer não gosta muito dessa coisa de dançar. Ele gosta mais é de ficar enchendo a cara no bar");
        }
        else if (nome == "Charles Xavier") {
            System.out.println("Infelizmente Charles não pode dançar devido a um acidente no Tibete contra o alienígena Lúcifer.");
        }
        else {
            System.out.println(nome + " está dançando...");
        }
    };
    // Método descrição, que serve para definir cada objeto, ou pelo menos, uma pequena descrição;
    public static void descrição(String nome){
        if (nome == "Homer Simpson" || nome == "Homer") {
            System.out.println("Homer Jay Simpson é um personagem de desenho animado criado por Matt Groening, \né o patriarca da família Simpsons, uma série de televisão da FOX. \nSua primeira aparição na televisão ocorreu em 19 de abril de 1987. \nMatt Groening o criou enquanto este estava na sala de espera do escritório de James L. Brooks.");
        }
        else if (nome == "Rocky" || nome == "Rocky Balboa"){
            System.out.println("Rocky, aposentado há muito tempo, trabalha em um restaurante na Filadélfia \ne lamenta a perda de sua amada mulher, Adrian. Com saudade de seus dias de glória,\nele pretende voltar ao ringue e aceita o desafio de lutar \ncontra o atual campeão mundial dos pesos pesados, Mason \"the Line\" Dixon.");
        }
        else if (nome == "Natasha" || nome == "Natasha Romanova") {
            System.out.println("Viúva Negra, é uma personagem das histórias em quadrinhos do Universo Marvel,\npublicado pela Marvel Comics. Criada por Stan Lee, Don Rico e Don Heck, \na personagem apareceu pela primeira vez em Tales of Suspense #52.");
        }
        else if (nome == "Lara" || nome == "Lara Croft"){
            System.out.println("Lara Croft é uma personagem fictícia e a protagonista da série de videojogos Tomb Raider da Square Enix. \nLara é apresentada como uma mulher bonita, \ninteligente e atlética, uma arqueóloga britânica que se aventura em antigas tumbas e \nruínas perigosas ao redor do mundo à procura de artefactos valiosos.");
        }
        else {
            System.out.println(nome + " É um objeto!");
        }
    };
    // Método dormir;
    public static void dormir(String nome){
        System.out.println(nome + " está dormindo... ZzZzZzZzZzZzZzZz");
    };
    // Método main  que irá conter os novos objetos criados
    public static void main(String[] args) {
        // Criando uma novo objeto da class Pessoa: aluno; E atribuindo a ela os atributos
        Pessoa aluno = new Pessoa();
        aluno.nome = "Luiz Gustavo";
        aluno.gênero = "masculino";
        aluno.altura = 1.70f;
        aluno.data_de_nascimento = "19/09/2001";
        aluno.cor_olhos = "castanho-claro";
        aluno.nacionalidade = "brasileiro";
        aluno.peso = 60;
        aluno.étnia = "branco";
        aluno.ocupação = "estudante do curso de engenharia de software na upe-garanhuns";
        aluno.idade = 17;
        // Métodos com o novo objeto aluno;
        /*
          ~~ onde ficará ~~
        */
        
        // Criando uma novo objeto da class Pessoa: Lara;
        Pessoa lara = new Pessoa();
        lara.nome = "Lara Croft";
        lara.altura = 1.60f;
        lara.peso = 64f;
        lara.cor_olhos = "castanho";
        lara.nacionalidade = "inglesa";
        lara.data_de_nascimento = "14/02/1966";
        lara.étnia = "branca";
        lara.ocupação = "Arqueóloga e aventureira";
        lara.idade = 53;
        lara.gênero = "Feminino";
        // Métodos para o novo objeto lara
        /*
          ~~ onde ficará ~~
        */
        
        // Criando uma novo objeto da class Pessoa: Natasha;
        Pessoa natasha = new Pessoa();
        natasha.nome = "Natasha Romanova";
        natasha.altura = 1.6f;
        natasha.cor_olhos = "verde";
        natasha.data_de_nascimento = "";
        natasha.gênero = "feminino";
        natasha.idade = 91;
        natasha.nacionalidade = "russa";
        natasha.ocupação = "Ex-espiã, agente secreta, professora, bailarina";
        natasha.peso = 57f;
        natasha.étnia = "branca";
        //Métodos para o novo objeto natasha
        /*
          ~~ onde ficará ~~
        */
        
        // Criando uma novo objeto da class Pessoa: Rocky;
        Pessoa rocky = new Pessoa();
        rocky.nome = "Rocky Balboa";
        rocky.gênero = "masculino";
        rocky.altura = 1.77f;
        rocky.data_de_nascimento = "06/07/1946";
        rocky.cor_olhos = "castanho-claro";
        rocky.nacionalidade = "americano";
        rocky.peso = 84f;
        rocky.étnia = "branco";
        rocky.ocupação = "boxeador e dono de restaurante";
        rocky.idade = 73;
        // Métodos para o novo objeto de Pessoa: Rocky;
        /*
          ~~ onde ficará ~~
        */
        
        // Criando uma novo objeto da class Pessoa: Homer;
        Pessoa homer = new Pessoa();
        homer.nome = "Homer Simpson";
        homer.gênero = "masculino";
        homer.altura = 1.66f;
        homer.data_de_nascimento = "19/07/1987";
        homer.cor_olhos = "preto";
        homer.nacionalidade = "estadunidense";
        homer.peso = 150f;
        homer.étnia = "literalmente: amarelo";
        homer.ocupação = "trabalha na Usina nuclear de Springfild";
        homer.idade = 32;
        // Métodos para o novo objeto da classe Pessoa: Homer;
        /*
          ~~ onde ficará ~~
        */
        
        // Criando um novo objeto da classe Pessoa: Professor;
        Pessoa professor = new Pessoa();
        professor.nome = "Charles Xavier";
        professor.gênero = "masculino";
        professor.altura = 1.78f;
        professor.data_de_nascimento = "01/09/1963";
        professor.cor_olhos = "preto";
        professor.nacionalidade = "estadunidense";
        professor.peso = 70;
        professor.étnia = "branco";
        professor.ocupação = "estudante do curso de engenharia de software na upe-garanhuns";
        professor.idade = 56;
        // Métodos para o novo objeto da classe Pessoa: Professor;
        /*
          ~~ onde ficará ~~
        */
    }
    
}
