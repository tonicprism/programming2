// Importando o Scanner da bibliotec util
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		
		// laço para repetir até a reposta ser válida
		System.out.println("Digite um número: ");
		while(true) {
			// 'Try'serve para testar se o valor é válido ou não
			try {
				String valor = entrada();// recebendo uma entrada
				int valorNum = Integer.parseInt(valor);
				int numAnt = valorNum - 1;
				int numPost = valorNum + 1;
				System.out.println("O número anterior é "+numAnt+" e o número posterior é "+numPost);
				break;
			} 
			// tratando a exceção
			catch(Exception e){
				System.out.println("Informe um número válido...");
			}

		}
	}
	// Criando um metodo que serve para receber a entrada
	public static String entrada() {
		Scanner s = new Scanner(System.in); // criando um objeto da classe Scanner
		String texto = s.nextLine();
		s.close(); // Fechando o scanner
		return texto;
	}
}
