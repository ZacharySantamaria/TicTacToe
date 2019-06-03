public class TicTacToe {
	
	private String[] board = new String[9];
	private boolean winner = false;
	private String winnerMsgX = "The winner is X!"; 
	private String winnerMsgO = "The winner is O!";
	
	public TicTacToe(){
		board[0] = "1";
		board[1] = "2";
		board[2] = "3";
		board[3] = "4";
		board[4] = "5";
		board[5] = "6";
		board[6] = "7";
		board[7] = "8";
		board[8] = "9";
	}
	
	public void setPlacement(int arrayLocation, String side){
		if(board[arrayLocation - 1].equals("X") || board[arrayLocation - 1].equals("O")) {
			System.out.println("There is already a element. Try again");
		}
		else{
			board[arrayLocation - 1] = side;
		}
	}

	public String getPlayer(int placement){
		return board[placement];
	}
	
	public boolean didIWin(){
		//horizontal
		for(int i =0; i<3; i++){
			if(board[i]==board[i+1] && board[i+1] == board[i+2]){
				winner=true;
				if(getPlayer(i).equals("X")){
					System.out.println(winnerMsgX);
				}
				else{
						System.out.println(winnerMsgO);
				}
			}
		}


		//Vertical

		for(int i=0; i<3; i++)
		{
			if(board[i]==board[i+3] && board[i+3]==board[i+6]){
				winner=true;
				if(getPlayer(i).equals("X")){                                      	
            		System.out.println(winnerMsgX);
            	}
            	else{
            			System.out.println(winnerMsgO);
            	}
			}	
		}		
		
		//Diagonal
		
		if((board[0] == board[4] && board[4] == board[8]) || (board[2]==board[4] && board[4]==board[6])){                                          winner=true;
				if(getPlayer(4).equals("X")){                                                             		
						System.out.println(winnerMsgX);                       		
				}                                                             		
				else{                                                             		
						System.out.println(winnerMsgO);                       		
				}                                                             		
		}                                                                     			
		
	return winner;	
	}
	
	public void reset(){
		board[0] = "1";
		board[1] = "2";
		board[2] = "3";
		board[3] = "4";
		board[4] = "5";
		board[5] = "6";
		board[6] = "7";
		board[7] = "8";
		board[8] = "9";
	}
	
	public boolean getWin(){
		return winner;
	}
	
	public void getPlacement(){
			
		System.out.println(board[0] + board[1] + board[2]);
		System.out.println(board[3] + board[4] + board[5]);
		System.out.println(board[6] + board[7] + board[8]+ "\n");
	}
}