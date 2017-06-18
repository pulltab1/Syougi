package board;

import piece.*;

public class Board{
	public static final int BOARD_SIZE = 9;
	public static final int MAX_PIECE = 40;
	
	private Piece[][] board = new Piece[BOARD_SIZE][BOARD_SIZE];
	
	public Board(){}
	public Piece[][] getBoard(){return board;}
	public void setBoard(Piece[][] board){
		for(int i = 0;i<BOARD_SIZE;i++){
			for(int j = 0;j<BOARD_SIZE;j++){
				this.board[i][j] = board[i][j];
			}
		}
	}
}
