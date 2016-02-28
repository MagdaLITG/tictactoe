import java.util.Scanner;

public class Tictactoe {
	
	public static void main(String[] args) {
		int where = 0;
		int ifSquareIsTaken = 0;
		int gameOver;
		int win;
		String[] names = {"player1", "player2"};
		
		System.out.println("Welcome in tictactoe game.\nPlease enter the name of the first player:");
		Scanner name1 = new Scanner(System.in);
        names[0] = name1.nextLine();
        System.out.println("Now, please enter the name of player 2:");
        Scanner name2 = new Scanner(System.in);
        names[1] = name2.nextLine();
        
        
        Board obj = new Board(names[0], names[1]);
        System.out.println("This is the board:");
        obj.printBoard();
        
        do{
        	where = obj.enterMove();
        	ifSquareIsTaken = obj.makeMove(where);
        	
        	while(ifSquareIsTaken == 1){
        		System.out.println("This square is already taken.");
        		where = obj.enterMove();
            	ifSquareIsTaken = obj.makeMove(where);
        	}
     
        	obj.printBoard();
        	gameOver = obj.checkIfGameOver();
        	win = obj.checkIfWin();
        	
        	if(gameOver == 1){
        		System.out.printf("It is a draw.\n");
        		break;
        	}
        	
        	if(win != 2){
        		System.out.printf("Congratulations! %s has won.", names[win]);
        		break;
        	}
        	
        	obj.nextTurn();
        
        
        } while( (gameOver == 0) || (win == 0));
	}
}
