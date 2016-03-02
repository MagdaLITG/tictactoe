
public class Board {
	char[] board = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};

	
	void fillSquare(int where, char what) {
		board[where] = what;	
	}
	
	char giveSquareContent(int where){
		return board[where];
	}
}
