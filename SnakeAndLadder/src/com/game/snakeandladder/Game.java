package com.game.snakeandladder;
import java.util.Scanner;
import java.util.Random;

public class Game {

	
	public static void main(String[ ] args) {
		Scanner scanner =new Scanner(System.in);
		int noOfPlayers = getPlayers(scanner);
		
		 int[] playerPosition = new int[noOfPlayers];
		 for(int i=0;i<=noOfPlayers;i++) {
			 playerPosition[i]=0;
		 }
		 play(noOfPlayers,scanner,playerPosition);
	}
	
	public static int getPlayers(Scanner scanner) {
		int noOfPlayers = scanner.nextInt();
		return noOfPlayers;
	}
	
	public static int random() {
		  Random random = new Random();
	        int randomInt = random.nextInt(7);
	        return randomInt;
	}
	
	public static void play(int noOfPlayers,Scanner scanner,int[] playerPosition) {
		for(int i=1;i<=noOfPlayers;i++) {
			System.out.println("Press r to roll the dice ");
			char c = scanner.next().charAt(1);
			if(c == 'r') {
				int rand  = random();
				System.out.println("Rolling Dice.............!");
				System.out.println(rand);
				if(playerPosition[i] < 100) {
					playerPosition[i] += rand;
					//
					if(playerPosition[i]==3)
				}else {
					System.out.println("Winner is Player: "+ i);
					break;
				}
			}else {
				System.out.println("You have pressed the wrong button, Please press 'r' to roll the dice");
			}
			
		}
	}
}
