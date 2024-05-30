package com.game.snakeandladder;
import java.util.Scanner;
import java.util.Random;

public class Game {

	
	public static void main(String[ ] args) {
		Scanner scanner =new Scanner(System.in);
		int noOfPlayers = getPlayers(scanner);
		
		 int[] playersPosition = new int[noOfPlayers];
		 for(int i=0;i<=noOfPlayers;i++) {
			 playersPosition[i]=0;
		 }
		 play(noOfPlayers,scanner);
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
	
	public static void play(int noOfPlayers,Scanner scanner) {
		for(int i=1;i<=noOfPlayers;i++) {
			System.out.println("Press r to roll the dice ");
			char c = scanner.next.charAt(1);
			if() {
				
			}
			
		}
	}
}
