
public class Humano implements comunicação, racionalidade, oqueé, locomoção {
	public String nome;
	@Override
	public void oQueEuSou(String nome) {
		// TODO Auto-generated method stub
		System.out.println(nome+" é um humano");
	}
	@Override
	public void éRacional(String nome) {
		// TODO Auto-generated method stub
		System.out.println(nome+" é um animal racional");
	}
	@Override
	public void seComunica(String nome) {
		// TODO Auto-generated method stub
		System.out.println(nome+" se comunica falando");
	}
	@Override
	public void seLocomove(String nome) {
		// TODO Auto-generated method stub
		System.out.println(nome+" se move em 2 pernas.");
		
	}
	
}
