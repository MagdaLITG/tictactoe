
public class Board {
	int zeroASCII = 48;
	char[] board = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};
	
	/*void fillBoard() {
		for(int i = 0; i<8; i++){
			int squareNumber = zeroASCII+i;
			board[i] = ( (char) squareNumber );
		}
	}*/

	
	void fillSquare(int where, char what) {
		board[where] = what;	
	}
	
	char giveSquareContent(int where){
		return board[where];
	}
}
