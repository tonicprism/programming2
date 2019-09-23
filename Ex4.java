import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			DecimalFormat deci =  new DecimalFormat("00.00"); 
			System.out.println("Digite o seu salário: ");
			float salario = s.nextFloat();	
			float salarioMinimo = 954f;
			System.out.println("A quantidade de salário mínimo é/são: "+deci.format(salario/salarioMinimo));
	}
}
