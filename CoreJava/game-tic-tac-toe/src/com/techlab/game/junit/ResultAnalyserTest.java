package com.techlab.game.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import com.techlab.game.*;

public class ResultAnalyserTest {

	@Test
	public void is_vertically_mark_matches_and_win() {
		
//		Arrange
		boolean expectedMatch=true;
		
//		Act
		Board b = new Board(3);
		b.putMark(1, Mark.CROSS);
		b.putMark(2, Mark.CROSS);
		b.putMark(3, Mark.CROSS);
		
		ResultAnalyser r = new ResultAnalyser(b);
		
		boolean actualMatch= r.checkWin();
		
//		Assert
		assertEquals(expectedMatch, actualMatch);
	}
	
	@Test
	public void is_horizontal_mark_matches_and_win() {
		
//		Arrange
		boolean expectedMatch=true;
		
//		Act
		Board b = new Board(3);
		b.putMark(1, Mark.CROSS);
		b.putMark(4, Mark.CROSS);
		b.putMark(7, Mark.CROSS);
		
		ResultAnalyser r = new ResultAnalyser(b);
		
		boolean actualMatch= r.checkWin();
		
//		Assert
		assertEquals(expectedMatch, actualMatch);
	}
	
	@Test
	public void is_Diagonally_mark_matches_and_win() {
		
//		Arrange
		boolean expectedMatch=false;
		
//		Act
		Board b = new Board(3);
		b.putMark(1, Mark.CROSS);
		b.putMark(6, Mark.CROSS);
		b.putMark(9, Mark.CROSS);
		
		ResultAnalyser r = new ResultAnalyser(b);
		
		boolean actualMatch= r.checkWin();
		
//		Assert
		assertEquals(expectedMatch, actualMatch);
	}
	
	

}
