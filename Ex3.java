import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Entrada de idade
		System.out.println("Digite a sua idade: ");
		int idadeAnos = s.nextInt(); //variável1
		int idadeBissexto = idadeAnos/4; //variável2
		
		// Calculando a idade em dias *não levando em consideração ano bissexto
		int idadeEmDiasBissextos = idadeAnos*365+idadeBissexto;
		int IdadeEmDiasNOrmais = idadeAnos*365;
		System.out.println("A idade do usuário - anos normais - em dias é "+idadeEmDiasBissextos+"\n e em anos bissextos: "+idadeEmDiasBissextos);
		
	}
}
