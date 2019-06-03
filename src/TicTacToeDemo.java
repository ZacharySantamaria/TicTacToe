import java.io.IOException;
import java.util.Scanner;

public class TicTacToeDemo {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		boolean tie = false;
		boolean win = false;
		int tieCounter= 0;
		String tieMsg = "Draw!";
		
		System.out.println("Welcome to ticTacToe");
		System.out.println("Remember X goes first");
		
		game.getPlacement();
				
		while(!win && !tie) {	
			tieCounter++;
			
			//default X goes first
			System.out.print("Player 'X' enter in your position");			
			int postion = keyboard.nextInt();
			System.out.print("\n");			
			game.setPlacement(postion, "X");
			
			//print board
			game.getPlacement();
			
			
			//Check for winner
			game.didIWin();
			if(game.getWin()){ 
				win = true;
			}
			
			else{
				if(tieCounter== 9){
					tie = true;
					System.out.println(tieMsg);
					break;
				}
				
				else{
					//'O' turn
					tieCounter++;
					System.out.println("Player 'O' enter in your position");
					postion = keyboard.nextInt();
					System.out.print("\n");			
					game.setPlacement(postion, "O");
					if(game.didIWin()){
							game.getPlacement();
							break;
					}
				}
			}
			
			//print board
			game.getPlacement();
		}
		keyboard.close();
	}
}