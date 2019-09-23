import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Quantidade notas: ");
		int quantidadeNota = s.nextInt();
		int control1 = 0;
		float valor = 0;
		float valor2 = valor;
		while (true) {	
			System.out.println("Digite uma nota: ");
			valor = s.nextFloat();
			valor2+=valor;
			control1++;
			// estrutura condicional que diz serve para saber se o control1 é igual a quantidade de notas para assim para
			if(control1 == quantidadeNota) {
				float media = valor2/control1;
				System.out.println(media);
				if(media >= 7) {
					System.out.println("Você passou!");
				}
				else {
					System.out.println("Você é um lixo!!!!!!!!!!!!!!!!!!!!!!! \nEstude mais!!!!!!!!!!!");
				}
				break;
			} 
		}

	} 
	

}
