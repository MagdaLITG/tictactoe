import java.util.HashSet;

public class Logic {
	char[] what = {'o', 'x'};
	int turn = 0;
	int squareContent = 0;
	boolean squareTaken = false;
	HashSet<Integer> moves = new HashSet<Integer>();
	
	Board board = new Board();
	Communication communication = new Communication();
	
	void startGame() {
		communication.DisplayGreetingMessage();
		communication.GetNamesOfPlayers();
	}
	
	void makeMove() {
		int where = communication.enterMove(turn, what[turn]);
		squareTaken = (moves.add(where));
		while(true) {
			if(squareTaken!=true){
				communication.SquareIsTakenMessage();
				communication.enterMove(turn, what[turn]);
			}
			board.fillSquare(where, what[turn]);
			
			if(turn == 0){
				turn = 1;
			} else{
				turn = 0;
			}
			break;
		}
	}
	
	void displayBoard() {
		for(int i = 0; i<9; i++) {
			squareContent = board.giveSquareContent(i);
			communication.DisplayBoard(squareContent, i);
		}
	}
	
	int checkIfGameOver() {
		 if((((board.giveSquareContent(0))=='x') && ((board.giveSquareContent(1))=='x') && ((board.giveSquareContent(2))=='x')) ||
			(((board.giveSquareContent(3))=='x') && ((board.giveSquareContent(4))=='x') && ((board.giveSquareContent(5))=='x')) ||
			(((board.giveSquareContent(6))=='x') && ((board.giveSquareContent(7))=='x') && ((board.giveSquareContent(8))=='x')) ||
			(((board.giveSquareContent(0))=='x') && ((board.giveSquareContent(3))=='x') && ((board.giveSquareContent(6))=='x')) ||
			(((board.giveSquareContent(1))=='x') && ((board.giveSquareContent(4))=='x') && ((board.giveSquareContent(7))=='x')) ||
			(((board.giveSquareContent(2))=='x') && ((board.giveSquareContent(5))=='x') && ((board.giveSquareContent(8))=='x')) ||
			(((board.giveSquareContent(0))=='x') && ((board.giveSquareContent(4))=='x') && ((board.giveSquareContent(8))=='x')) ||
			(((board.giveSquareContent(2))=='x') && ((board.giveSquareContent(4))=='x') && ((board.giveSquareContent(6))=='x')) ||
			(((board.giveSquareContent(0))=='o') && ((board.giveSquareContent(1))=='o') && ((board.giveSquareContent(2))=='o')) ||
			(((board.giveSquareContent(3))=='o') && ((board.giveSquareContent(4))=='o') && ((board.giveSquareContent(5))=='o')) ||
			(((board.giveSquareContent(6))=='o') && ((board.giveSquareContent(7))=='o') && ((board.giveSquareContent(8))=='o')) ||
			(((board.giveSquareContent(0))=='o') && ((board.giveSquareContent(3))=='o') && ((board.giveSquareContent(6))=='o')) ||
			(((board.giveSquareContent(1))=='o') && ((board.giveSquareContent(4))=='o') && ((board.giveSquareContent(7))=='o')) ||
			(((board.giveSquareContent(2))=='o') && ((board.giveSquareContent(5))=='o') && ((board.giveSquareContent(8))=='o')) ||
			(((board.giveSquareContent(0))=='o') && ((board.giveSquareContent(4))=='o') && ((board.giveSquareContent(8))=='o')) ||
			(((board.giveSquareContent(2))=='o') && ((board.giveSquareContent(4))=='o') && ((board.giveSquareContent(6))=='o')) ) {
				return turn;	
		}else if( (moves.size())==9){
				return 2;
		}else {
				return 3;
		}
	}
	
	void gameOver(int gameOver) {
		communication.DisplayGameOverMessage(gameOver);
	}
	
	
	
}
