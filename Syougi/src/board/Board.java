package board;

import common.Position;
import exception.CannotMovableException;
import exception.CannotSetPiece;
import piece.*;

public class Board implements Cloneable{
	public static final int BOARD_SIZE = 9;
	public static final int MOVE_COUNT = 1;
	public static final int REVERSE_AREA = 3;
	
	private Piece[][] board;
	
	public static Piece[][] getDefaultBoardPattern(){
		Piece[][] board = new Piece[BOARD_SIZE][BOARD_SIZE];
		board[0][0] = new Kyousya(false);
		board[1][0] = new Keima(false);
		board[2][0] = new Gin(false);
		board[3][0] = new Kin(false);
		board[4][0] = new Ou(false);
		board[5][0] = new Kin(false);
		board[6][0] = new Gin(false);
		board[7][0] = new Keima(false);
		board[8][0] = new Kyousya(false);
		
		board[1][1] = new Hisya(false);
		board[7][1] = new Kaku(false);
		
		for(int i = 0;i<BOARD_SIZE;i++){
			board[i][2] = new Fu(false);
		}
		board[BOARD_SIZE - 1][BOARD_SIZE - 1] = new Kyousya(true);
		board[BOARD_SIZE - 1 - 1][BOARD_SIZE - 1] = new Keima(true);
		board[BOARD_SIZE - 1 - 2][BOARD_SIZE - 1] = new Gin(true);
		board[BOARD_SIZE - 1 - 3][BOARD_SIZE - 1] = new Kin(true);
		board[BOARD_SIZE - 1 - 4][BOARD_SIZE - 1] = new Ou(true);
		board[BOARD_SIZE - 1 - 5][BOARD_SIZE - 1] = new Kin(true);
		board[BOARD_SIZE - 1 - 6][BOARD_SIZE - 1] = new Gin(true);
		board[BOARD_SIZE - 1 - 7][BOARD_SIZE - 1] = new Keima(true);
		board[BOARD_SIZE - 1 - 8][BOARD_SIZE - 1] = new Kyousya(true);
		
		board[BOARD_SIZE - 1 - 1][BOARD_SIZE - 1 - 1] = new Hisya(true);
		board[BOARD_SIZE - 1 - 7][BOARD_SIZE - 1 - 1] = new Kaku(true);
		
		for(int i = 0;i<BOARD_SIZE;i++){
			board[i][BOARD_SIZE - 1 - 2] = new Fu(true);
		}
		return board;
	}
	
	public Board(){
		board = getDefaultBoardPattern();
 	}
	public Piece[][] getBoard(){
		return board.clone();
	}
	public boolean checkMovable(Operation operation,boolean isOpponent){
		Position position = operation.getPosition();
		if(board[position.getX()][position.getY()]==null){
			return false;
		}
		return board[position.getX()][position.getY()].checkMovable(operation,board,isOpponent);
	}

	public void reversePiece(Piece piece){
		if(piece instanceof Reversible){
			((Reversible) piece).reverse();
		}
	}
	
	public Piece movePiece(Player player,Operation operation) throws CannotMovableException{
		
		Position position = operation.getPosition();
		Position target = operation.getTarget();
		Piece getpiece = null;
		
		if(board[position.getX()][position.getY()] != null && checkMovable(operation,player.isOpponent())){
			if( board[target.getX()][target.getY()] != null && board[target.getX()][target.getY()].isOpponent() != player.isOpponent()){
				getpiece = board[target.getX()][target.getY()].clone();
			}
			board[target.getX()][target.getY()] = board[position.getX()][position.getY()].clone();	
			board[position.getX()][position.getY()] = null;

			if(!board[target.getX()][target.getY()].isOpponent()&&target.getY()>=BOARD_SIZE-REVERSE_AREA){
				reversePiece(board[target.getX()][target.getY()]);
			}
			if(board[target.getX()][target.getY()].isOpponent()&&target.getY()<REVERSE_AREA){
				reversePiece(board[target.getX()][target.getY()]);
			}
			
		}
		else{
			throw new CannotMovableException();
		}
		return getpiece;
	}
	public boolean checkSetPiece(Operation operation){
		Position target = operation.getTarget();
		if(board[target.getX()][target.getY()] == null)
			return false;
		return true;
	}
	public void setPiece(Operation operation) throws CannotSetPiece{
		Position target = operation.getTarget();
		if(operation.getPiece() == null)throw new CannotSetPiece();
		board[target.getX()][target.getY()] = operation.getPiece().clone();
	}
	public void draw(){
		for(int i=0;i<BOARD_SIZE;i++){
			System.out.print("|");
			for(int j=0;j<BOARD_SIZE;j++){
				if(board[j][i]!=null){
					if(!board[j][i].isOpponent()){
						System.out.print(board[j][i].getName());
					}
					else{
						System.out.print(board[j][i].getName());
					}
				}
				else{
					System.out.print("|");
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	@Override
    public Board clone(){
        try {
			return (Board)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
    }
}
