public class Teste01 {
	private int idade = 10;
	private static int id = 20;
	int ida = 10;

	public static void main(String[] args) {
		
		Teste01 t = new Teste01();
		// eu não consigo ter acesso, porque eu estou usando um atributo dinâmico dentro de um metodo estático;
		System.out.println(ida);
		// para conseguir acesso a esse atributo dinâmico eu devo dar uma instância do objeto;
		System.out.println(t.id);
		// Já aqui eu consigo ter acesso porque esse atributo é estático;
		System.out.println(id);
		

		
		
		
		
		
		
	}

}
