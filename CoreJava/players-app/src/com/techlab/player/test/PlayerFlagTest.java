package com.techlab.player.test;

import com.techlab.player.PlayerFlag;
import com.techlab.player.PlayerFlag;

public class PlayerFlagTest {
	
	public static void main(String[] args) {
		
		PlayerFlag sachin = new PlayerFlag(115,"Sachin",45,'a');
		
		PlayerFlag virat = new PlayerFlag(145, "Virat", 'b');
		

		sachin.whoIsBetterPlayer(virat);
		
		
		playerInfo(sachin);
		playerInfo(virat);
		
	}

	private static void playerInfo(PlayerFlag p) {
		System.out.println("\nID : "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("Age : "+p.getAge());
		System.out.println("Credit Point : "+p.getCreditPoints());
		if(p.getFlag()==true)
			System.out.println(p.getName() +" is better player...");
		
	}

}
