package com.game.snakeandladder;
import java.util.Scanner;
import java.util.Random;

public class Game {

	
	public static void main(String[ ] args)throws InterruptedException {
		Scanner scanner =new Scanner(System.in);
		int noOfPlayers = getPlayers(scanner);
		
		 int[] playerPosition = new int[noOfPlayers+1];
		 for(int i=0;i<=noOfPlayers;i++) {
			 playerPosition[i]=0;
		 }
		play(noOfPlayers,scanner,playerPosition);
	}
	public static void play(int noOfPlayers,Scanner scanner,int[] playerPosition) throws InterruptedException{
		boolean win = false;
		System.out.println("-----------------GAME STARTS-------------");
		while(!win) {
			for(int i=1;i<=noOfPlayers;i++) {
				System.out.println("Press r to roll the dice ");
				char c = scanner.next().charAt(0);
				if(c == 'r') {
					int rand  = random();
					System.out.println("Rolling Dice.............!");
					Thread.sleep(1500);
					System.out.println(rand);
					if(playerPosition[i] < 100) {
						playerPosition[i] += rand;
						int position = playerPosition[i];
						//checking ladders and snakes
						playerPosition[i] = ladder(position);
						playerPosition[i] = snake(position);
						System.out.println("The position of player " +i+ " is "+playerPosition[i]);
					}else {
						System.out.println("Winner is Player: "+ i);
						win  = true;
						break;
					}
				}else {
					System.out.println("You have pressed the wrong button, Please press 'r' to roll the dice");
				}
				
			}
			
		}
		System.out.println("-----------------GAME OVER-------------");
	
	}
	public static int getPlayers(Scanner scanner) {
		System.out.println("Enter the no of players");
		int noOfPlayers = scanner.nextInt();
		return noOfPlayers;
	}
	public static int ladder(int position) {
		
		if(position == 1) {
			return 38;
		}if(position == 4) {
			return 14;
		}if(position == 8) {
			return 30;
		}if(position == 21) {
			return 42;
		}if(position == 28) {
			return 76;
		}if(position == 50) {
			return 67;
		}if(position == 71) {
			return 92;
		}if(position == 80) {
			return 99;
		}
		return position;
	}
	public static int snake(int position) {
		
		if(position == 32) {
			return 10;
		}if(position == 36) {
			return 6;
		}if(position == 48) {
			return 26;
		}if(position == 62) {
			return 18;
		}if(position == 88) {
			return 24;
		}if(position == 95) {
			return 56;
		}if(position == 97) {
			return 78;
		}
		return position;
	}
	public static int random() {
		int min =1;
		int max = 7;
		int randomInt = (int)(Math.random()*(max-min)) + min;
		return randomInt;   
	}
	
}
