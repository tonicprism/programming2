import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex5 {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Digite o seu salário bruto: ");
	 double salarioBruto = s.nextDouble();
	 DecimalFormat deci = new DecimalFormat("00.00");
	 double descontoINSS = salarioBruto*0.11;
	 double descontoIRRF = salarioBruto*0.075f;
	 double descontos = descontoINSS + descontoIRRF;
	 double salarioLiquido = salarioBruto - descontos;
	 System.out.println("O seu salário liquido é "+deci.format(salarioLiquido));
 }
}
