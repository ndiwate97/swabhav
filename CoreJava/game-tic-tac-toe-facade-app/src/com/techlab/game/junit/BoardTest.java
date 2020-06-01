package com.techlab.game.junit;

import static org.junit.Assert.*;

import javax.activation.MailcapCommandMap;

import org.junit.Test;

import com.techlab.game.*;

public class BoardTest {

	@Test
	public void  check_if_marks_is_set_on_a_given_position() {
		
//		Arrange
		Mark expectedMark = Mark.CROSS;
		
//		Act
		Board b = new Board(3);
		b.putMark(5, Mark.CROSS);
		Cell c = new Cell(5);
//		Assert
		assertEquals(expectedMark, Board.board[c.getX()][c.getY()]);
	}

	@Test
	public void check_if_board_has_empty_cells() {
		
//		Arrange
		Mark expectedBoard[][] = new Mark[3][3];
		
//		Act
		Board b = new Board(3); 
		
//		Assert
		assertArrayEquals(expectedBoard, b.getBoard());
	}

}
