package Ex06;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		
		// Lista de Heróis
		String[] listaHerois = {"CapitaoAmerica", "HomemDeFerro", "ViuvaNegra", "HomemAranha", "PanteraNegra","Hulk","Thor", "Wolverine","GaviaoArqueiro", "CapitaMarvel"};
		// Lista de Vilões
		String[] listaViloes = {"CaveiraVermelha", "Ultron", "Thanos", "Magneto", "DuendeVerde", "Misterio", "HulkVermelho", "Loki", "Treinador","Ronan"};
		
		// Instancia da classe Scanner
		Scanner s = new Scanner(System.in);
		
		// Entrada do scanner
		System.out.println("Digite o nome de um heroi: ");
		String busca = s.nextLine().toLowerCase();
		
		// Varredura de valores na lista
		for(int i=0;i<10;i++) {
			// Busca na lista dos Heróis
			if(busca.equals(listaHerois[i].toLowerCase()))
				{
					System.out.println("É um héroi...");
				}
			// Busca na lista dos Vilões	
			else if(busca.equals(listaViloes[i].toLowerCase()))
				{
					System.out.println("É um vilão... ");
				}
			else {
				System.out.println("Ele não faz parte de nenhuma das listas...");
			}
			 }
		
		}
	 }

