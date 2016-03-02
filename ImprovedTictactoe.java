
public class ImprovedTictactoe {
	public static void main(String[] args) {
		int gameOver = 0;
		
		Logic newGame = new Logic();
		
		newGame.startGame();
		newGame.displayBoard();
		
		do {
			newGame.makeMove();
			newGame.displayBoard();
			gameOver = newGame.checkIfGameOver();
		}while(gameOver == 3);
		
		newGame.gameOver(gameOver);
	}
	
	
}
