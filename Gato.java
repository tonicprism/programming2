
public class Gato implements locomoção, comunicação, racionalidade, oqueé {
	public String nome;
	@Override
	public void oQueEuSou(String nome) {
		System.out.println(nome+" é um gato");
		
	}

	@Override
	public void éRacional(String nome) {
		System.out.println(nome+" não é racional");
		
	}

	@Override
	public void seComunica(String nome) {
		// TODO Auto-generated method stub
		System.out.println(nome+" se comunica miando");
	}

	@Override
	public void seLocomove(String nome) {
		// TODO Auto-generated method stub
		System.out.println(nome+" se move com suas quatro patas");
	}

}