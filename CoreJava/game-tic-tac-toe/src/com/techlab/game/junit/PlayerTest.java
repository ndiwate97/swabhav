package com.techlab.game.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlab.game.Mark;
import com.techlab.game.Player;

public class PlayerTest {

	@Test
	public void testPlayer() {
		
//		Arrange
		String expectedPlayerName = "Player1";
		Mark expectedMark = Mark.NOUGHT;
		
//		Act
		Player p = new Player("Player1", Mark.NOUGHT);
		
//		Assert
		assertEquals(expectedPlayerName, p.getPlayerName());
		assertEquals(expectedMark, p.getMark());
	}

}
