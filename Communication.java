import java.util.Scanner;

public class Communication {
	String[] names = {"player1", "player2"};
	
	
	void DisplayGreetingMessage() {
		System.out.println("Welcome in tictactoe game.");
	}
		
	void GetNamesOfPlayers() {
		System.out.println("Please enter the name of the first player:");
		Scanner name1 = new Scanner(System.in);
        names[0] = name1.nextLine();
        System.out.println("Now, please enter the name of player 2:");
        Scanner name2 = new Scanner(System.in);
        names[1] = name2.nextLine();
	}
	
	void DisplayBoard(int what, int square){
		System.out.printf("%c", what);
		if( (square%3) == 2) {
			System.out.printf("\n");
		}
	}
	
	int enterMove(int turn, char what) {
		System.out.printf("%s, please choose the number of square where you want to put %c.", names[turn], what);
		Scanner move = new Scanner(System.in);
        int where = move.nextInt();
        
        return where;
	}
	
	void SquareIsTakenMessage() {
		System.out.println("The square is already taken.");
	}
	
	void DisplayGameOverMessage(int gameOver) {
		if(gameOver == 2) {
			System.out.println("Game over! It is a draw.");
		}else {
			System.out.printf("Congratulations! %s has won.", names[gameOver]);
		}
	}
}
