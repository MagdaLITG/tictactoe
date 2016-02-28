import java.util.Scanner;

public class Board {
	int turn = 0;
	int takenSquare = 0;
	int numberOfFilledSquares = 0;
	char[] board = {'0','1','2','3','4','5','6','7','8'};
	char[] what = {'x', 'o'};
	String[] names = {"player1", "player2"};
	
	
	public Board(String name1, String name2){
		names[0] = name1;
		names[1] = name2;
	}
	
	int enterMove(){
		System.out.printf("%s, please choose the number of square where you want to put %c.", names[turn], what[turn]);
		Scanner move = new Scanner(System.in);
        return (move.nextInt());
	}
	
	
	int makeMove(int where){
		if((board[where] == 'x') || (board[where] == 'o')){
			takenSquare = 1;
			return takenSquare;
		}
		
		board[where] = what[turn];
		numberOfFilledSquares++;
		takenSquare = 0;
		return takenSquare;
	}
	
	void printBoard(){
		if(takenSquare == 0){
			for(int i=0; i<board.length; i++){
				System.out.printf("%c ", board[i]);
				if(i%3==2){
					System.out.printf("\n");
				}	
			}
		}
	}
	
	int checkIfGameOver() {
		if(numberOfFilledSquares == board.length){
			return 1;
		} else {
			return 0;
		}
	}
			
	int checkIfWin(){
		if((((board[0]=='x') && (board[1]=='x') && (board[2]) =='x')) ||
			(((board[3]=='x') && (board[4]=='x') && (board[5]) =='x')) ||
			(((board[6]=='x') && (board[7]=='x') && (board[8]) =='x')) ||
			(((board[0]=='x') && (board[3]=='x') && (board[6]) =='x')) ||
			(((board[1]=='x') && (board[4]=='x') && (board[7]) =='x')) ||
			(((board[2]=='x') && (board[8]=='x') && (board[9]) =='x')) ||
			(((board[0]=='x') && (board[4]=='x') && (board[8]) =='x')) ||
			(((board[2]=='x') && (board[4]=='x') && (board[6]) =='x')) ||
			(((board[0]=='o') && (board[1]=='o') && (board[2]) =='o')) ||
			(((board[3]=='o') && (board[4]=='o') && (board[5]) =='o')) ||
			(((board[6]=='o') && (board[7]=='o') && (board[8]) =='o')) ||
			(((board[0]=='o') && (board[3]=='o') && (board[6]) =='o')) ||
			(((board[1]=='o') && (board[4]=='o') && (board[7]) =='o')) ||
			(((board[2]=='o') && (board[8]=='o') && (board[9]) =='o')) ||
			(((board[0]=='o') && (board[4]=='o') && (board[8]) =='o')) ||
			(((board[2]=='o') && (board[4]=='o') && (board[6]) =='o')) ) {
			return turn;	
		} else {
			return 2;
		}
	}
		
	void nextTurn(){
		if(turn == 0){
			turn = 1;
		} else{
			turn = 0;
		}
	}
	
	
}