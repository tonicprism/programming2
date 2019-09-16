import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("[0] Humano [1] Cachorro [2] Gato");
		System.out.println("Informe o animal a ser criado: ");
		String escolha = s.nextLine();
		// Se a escolha for Humano
		if(escolha.equals("0")) {
			System.out.println("Informe o nome do humano: ");
			String nome = s.nextLine();
			Humano h = new Humano();
			h.nome = nome;
			h.oQueEuSou(nome);
			h.éRacional(nome);
			h.seComunica(nome);
			h.seLocomove(nome);
		
		}
		// Se a escolha for Cachorro 
		else if (escolha.equals("1")) {
			System.out.println("Informe o nome do cachorro: ");
			String nome = s.nextLine();
			Cachorro c = new Cachorro();
			c.nome= nome;
			c.oQueEuSou(nome);
			c.éRacional(nome);
			c.seComunica(nome);
			c.seLocomove(nome);
			
		} 
		// Se a escolha for Gato
		else if (escolha.equals("2")) {
			System.out.println("Informe o nome do gato: ");
			String nome = s.nextLine();
			Gato g = new Gato();
			g.nome= nome;
			g.oQueEuSou(nome);
			g.éRacional(nome);
			g.seComunica(nome);
			g.seLocomove(nome);
			
		}
	}
}
