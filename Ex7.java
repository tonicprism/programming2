package Ex07;

import java.util.Timer;
import java.util.TimerTask;
import java.util.*;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int somaChapa1 = 0;
		int somaChapa2 =0;
		int contador = 0;
		long t = System.currentTimeMillis();
		long end = t+60000;
		try {
			while(System.currentTimeMillis()<end) {
				System.out.println("Digite o número da chapa que você quer votar[1 ou 2]");
				int votação = s.nextInt();
				if(votação != 2 && votação != 1) {
					System.out.println("Wrong number");
				} else {
					if(votação == 1) {
						somaChapa1++;
					} else {
						somaChapa2++;
					}
				}	
				contador++;
			}
			System.out.println("A chapa 1 teve: "+somaChapa1+" e A chapa 2 teve: "+somaChapa2);
			if(somaChapa1>somaChapa2) {
				System.out.println("Chapa 1 venceu!");
			} else {
				System.out.println("Chapa 2 venceu!");
			}
		} catch (Exception e) {
			System.out.println("Este valor não é um número, rode o programa de novo por favor...");	
		}
	}		
}


