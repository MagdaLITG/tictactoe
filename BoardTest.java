import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testGiveSquareContent() {
		for(int i=0; i<9; i++){
			Board obj = new Board();
			char squareContent = obj.giveSquareContent(i);
			assertEquals("Square content different than expected.",squareContent, obj.board[i]);
		}
	}

}
