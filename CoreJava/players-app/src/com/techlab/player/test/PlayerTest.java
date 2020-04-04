package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		
		Player sachin = new Player(115,"Sachin",45,'a');
		
		Player virat = new Player(145, "Virat", 'b');
		
		
		playerInfo(sachin);
		playerInfo(virat);
		
		Player temp = sachin.whoIsBetterPlayer(virat);
		
		System.out.println("\nInfo of Better Player:");
		playerInfo(temp);
		
//		case 2:
		
		printWhoIsBetter(sachin,virat);
	}
	
	

	private static void printWhoIsBetter(Player p1, Player p2) {
		String player;
		Player betterPlayer=p1.whoIsBetterPlayer(p2);
		
		if(betterPlayer.getName()==p1.getName())
			player=p2.getName();
		else 
			player=p1.getName();
		
		System.out.println("\n"+betterPlayer.getName()+" is better than "+player);
	}



	private static void playerInfo(Player p) {
		System.out.println("\nID : "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("Age : "+p.getAge());
		System.out.println("Credit Point : "+p.getCreditPoints());
		
	}

}
