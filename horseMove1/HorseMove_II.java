package horseMove1;

import java.util.Arrays;
import java.util.Scanner;

public class HorseMove_II {
	
	public static int n =8;
//	 {2, 1, -1, -2, -2, -1, 1, 2 };
//    {1, 2, 2, 1, -1, -2, -2, -1 };
	
	public static int xMove[]= {2,1,-1,-2,-2,-1,1,2};
	public static int yMove[]= {1,2,2,1,-1,-2,-2,-1};
	static int board[][] = new int[n][n];
	
	
	public static void main(String[] args) {
//	  Scanner sc = new Scanner(System.in);
	  
//	  n = sc.nextInt();
//	  int r = sc.nextInt();
//	  int c = sc.nextInt();
//		for (int[] row : board) {
//            Arrays.fill(row, -1);
//        }
	  
	  board[0][0] = 1;
			  
	  if(horseMove(0,0,1)) {
		  for(int i=0;i<n;i++) {
			  for(int j =0;j<n;j++) {
				  System.out.print(board[i][j] +" ");
			  }
			  System.out.println();
		  }
	  }
		  
	   else {
		   System.out.println("Moves are not possiable");
	   }
		  	  
	}


	private static boolean horseMove(int r, int c, int move) {
		if(move == n*n) 
			return true;
		int move_x,move_y;
		for(int i =0;i<n;i++) {
			move_x = r+xMove[i];
			move_y = c+yMove[i];
			if(validMove(move_x,move_y)) {
				board[move_x][move_y] = move+1;
				if(horseMove(move_x,move_y,move+1)) 
					return true;
				else 
					board[move_x][move_y] = 0;
					
			}
		}	
		return false;
	}


	private static boolean validMove(int r, int c) {
		return(r>=0 && c>=0 && r<n && c<n && board[r][c] == 0);
		
	}

}
