package com.techlab.game.junit;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

import org.junit.*;

import com.techlab.game.*;

public class CellTest<ExpectedLogs> {

	@Test
	public void check_if_marks_is_selected_properly() {

//		Arrange
		int expectedX = 0;
		int expectedY = 1;

// 		Act
		Board b = new Board(3);
		Cell c = new Cell(2);
		c.CalculateCellCoordinates();

//		Assert
		assertEquals(expectedX, c.getX());
		assertEquals(expectedY, c.getY());

	}



	@Test
	public void check_if_marks_dont_overwrite_other_marks_in_a_call_and_throws_exception_if_we_try() throws Exception {

		/*
		 * final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		 * 
		 * System.setOut(new PrintStream(outContent));
		 * 
		 * String expectedOutput = "Position already occupied....";
		 * 
		 * 
		 * Cell c = new Cell(2); Cell.selectedPosition.add(2); Cell.isPositionFree(2);
		 * 
		 * System.getProperty("line.separator") ;
		 * 
		 * assertEquals(expectedOutput+ System.getProperty("line.separator"), outContent.toString());
	     */
	        
//		Arrange
		boolean expectedReturn = false;
//		Act
		
		Cell c = new Cell(2); 
		Cell.selectedPosition.add(2); 
		
		
//		Assert
		assertEquals(expectedReturn, Cell.isPositionFree(2));
	}
	

	@Test
	public void check_if_position_is_out_of_limit() throws CellIsAlreadyOccupied{
		
	      
//			Arrange
			boolean expectedReturn = false;
//			Act
			
			Board b = new Board(3);
			Cell c = new Cell(2); 
			
			
//			Assert
			assertEquals(expectedReturn, Cell.isPositionFree(15));
		
	}
	
}
