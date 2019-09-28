/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luiz Gustavo
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        // the somatory of points of the user
        int pontos = 0;
        // the color
        String cor;
        Scanner scan = new Scanner(System.in);
        // the looping while, how's go from 0 to 10
        while(contador != 10){
            // the meter
            contador++;
            System.out.println("Type a color to try guess it: ");
            // the guess color
            String advCor = scan.nextLine();
            if(advCor != "blue" || advCor != "yellow" || advCor != "red" || advCor != "green"){
                System.out.println("This color isn't available! Please, try again");
            }
            Random num = new Random();
            // the number of the raffle color
            int corNum = num.nextInt(3);
            // the transformation from the number raffle into a string of a color
            if(corNum == 0){
                cor = "blue";
                System.out.println("------------------------------------");
                System.out.println("the raffle color was blue");
                System.out.println("------------------------------------");
                // checking if the color is egual to guessed color
                if(cor.equals(advCor)){
                    pontos++;
                // if you dont guess the color the program break
                } else {
                    System.out.println("YOU LOSE, TRY AGAIN OTHER TIME LOSER!!!!!");
                    System.out.println("Your amount of points it's: "+pontos);
                    break;
                }
            }
            else if(corNum == 1){
                cor = "red";
                System.out.println("------------------------------------");
                System.out.println("The raffle color was red");
                System.out.println("------------------------------------");
                // checking if the color is egual to guessed color
                if(cor.equals(advCor)){
                    pontos++;
                // if you dont guess the color the program break
                } else {
                    System.out.println("YOU LOSE, TRY AGAIN OTHER TIME LOSER!!!!!");
                    System.out.println("Your amount of points it's: "+pontos);
                    break;
                }
            }
            else if(corNum == 2){
                cor = "green";
                System.out.println("------------------------------------");
                System.out.println("The raffle color was green");
                System.out.println("------------------------------------");
                // checking if the color is egual to guessed color
                if(cor.equals(advCor)){
                    pontos++;
                // if you dont guess the color the program break
                } else {
                    System.out.println("YOU LOSE, TRY AGAIN OTHER TIME LOSER!!!!!");
                    System.out.println("Your amount of points it's: "+pontos);
                    break;
                }
            }
            else if(corNum == 3){
                cor = "yellow";
                System.out.println("------------------------------------");
                System.out.println("The raffle color was yellow");
                System.out.println("------------------------------------");
                // checking if the color is egual to guessed color
                if(cor.equals(advCor)){
                    pontos++;
                // if you dont guess the color the program break
                } else {
                    System.out.println("YOU LOSE, TRY AGAIN OTHER TIME LOSER!!!!!");
                    System.out.println("Your amount of points it's: "+pontos);
                    break;
                    
                }

            }
            
        }
       
    }
}

