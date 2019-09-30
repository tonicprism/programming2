package Pacote;

import java.util.Random;

public class Futebyte {

	public static final int TIME_1 = 5754;
	public static final int TIME_2 = 674575;
	
	public static final int TECNICA_1 = 3;
	public static final int TECNICA_2 = 5;
	
	public static int TIME_1_GOLS = 0;
	public static int TIME_2_GOLS = 0;
	
	static Random rnd2 = new Random();
	
	// nome do time
	public static String nomeTime(int idTime) {
		switch(idTime) {
		case TIME_1:
			return "Flamengo";
		case TIME_2:
			return "Grêmio";
		default:
			return "";
		}
	}
	
	// tentativa de gol
	public static void TentativaDeGol(int idTime) {
		System.out.println("Tentativa de gol...");
		switch(AutordoLance(TECNICA_1, TECNICA_2)) {
		case TIME_1:
			System.out.println("Time " + nomeTime(TIME_1) + " está a beira do gol...");
			if (rnd2.nextInt(2) == 1) {
				TIME_1_GOLS++;
				System.out.println("Gol do time " + nomeTime(TIME_1));
			}
			break;
		case TIME_2:
			System.out.println("Time " + nomeTime(TIME_2) + " está a beira do gol...");
			if (rnd2.nextInt(2) == 1) {
				TIME_2_GOLS++;
				System.out.println("Gol do time " + nomeTime(TIME_2));
			}
			break;
		}
	}
	
	// autor do lance
	public static int AutordoLance(int tecnica1, int tecnica2) {
		int cns = rnd2.nextInt(4) + 1;
		int fator1 = tecnica1 * cns;
		int fator2 = tecnica2 * cns;
		if (fator1 > fator2) {
			return TIME_1;
		}
		else {
			if (fator2 > fator1) {
				return TIME_2;
			}
			else {
				return 0;
			}
		}
	}	
	
	

	
	// lance de perigo
	public static void LanceDePerigo() {
		int bool = rnd2.nextInt(2);
		if (bool == 1) {
			System.out.println("Lance de perigo ocorreu...");
			int autor = AutordoLance(TECNICA_1, TECNICA_2);
			TentativaDeGol(autor);
		}
	}
	
	// lance de penalti
	public static void LanceDePenalti() {
		System.out.println("Lance de penalti ocorreu!");
		int sorteado = rnd2.nextInt(5) + 1;
		if (sorteado == 3) {
			int timedoLance = AutordoLance(TECNICA_1, TECNICA_2);
			System.out.println(" TIME AUTOR: " + timedoLance);
			if (timedoLance == TIME_1) {
				System.out.println("Time " + nomeTime(TIME_1) + " marcou o gol de penalti!");
				TIME_1_GOLS++;
			}
			else {
				if (timedoLance == TIME_2) {
					System.out.println("Time " + nomeTime(TIME_2) + " marcou o gol de penalti!");
					TIME_2_GOLS++;
				}
			}
		}
		else {
			System.out.println("E o jogo prossegue normalmente!");
		}
	}
	
	// contabilizar gols
	public static void ContabilizarGol(int idTime) {
		if(idTime == TIME_1 ) {
			TIME_1_GOLS++;
		}
		if(idTime == TIME_2) {
			TIME_2_GOLS++;
		}		
	}
	
	// intervalo 
	public static void EventoIntervalo() {
		try {
			Thread.sleep(1000);
			System.out.println("O jogo está no intervalo...");
			Thread.sleep(1000);
			System.out.println("Placar do jogo: " + nomeTime(TIME_1) + " " + TIME_1_GOLS + " x " + nomeTime(TIME_2) + " " + TIME_2_GOLS);
			Thread.sleep(8000);
		}
		catch(Exception ex) {}
	}

	public static void main(String[] args) {
		int tempo = 0;
		boolean bFlag = true;
		while(bFlag) {
			System.out.println("O jogo está em andamento..." );
			if (tempo == 46) {
				System.out.println("Recomeça o jogo, início do segundo tempo.");
			}
			try {
				if (tempo % 5 == 0) {
					System.out.println("gjhgjgfj");
					//disparar lancedeperigo
					LanceDePerigo();
				}
				if (tempo % 9 == 0) {
					//disparar lance de penalti
					LanceDePenalti();
				}
				switch(tempo) {
				case 45:
					EventoIntervalo();
					break;
				case 90:
					System.out.println("Fim de jogo.");
					System.out.println("Placar do jogo: " + nomeTime(TIME_1) + " " + TIME_1_GOLS + " x " + nomeTime(TIME_2) + " " + TIME_2_GOLS);
					
					bFlag = false;
					break;
				}
				Thread.sleep(1000);
				tempo++;
			}
			catch(Exception e){}
		}
	}



}
