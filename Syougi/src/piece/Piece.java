package piece;

import java.util.ArrayList;
import java.util.List;

import board.Board;
import common.Position;
import exception.NotMovableException;

public class Piece {
	protected Position position;
	protected List<Position> moveOperation;
	protected char name;
	protected boolean isKing;
	
	public Piece(Position position){
		this.position = new Position(position);
	}
	
	protected void setMoveOperation(List<Position> moveOperation){
		this.moveOperation = new ArrayList<>(moveOperation);
	}
	
	public int getX(){return position.getX();}
	public int getY(){return position.getY();}
	public char getName(){return name;}
	
	public boolean checkMovableTarget(Position target){
		for(Position op : moveOperation){
			int x = position.getX() + op.getX();
			int y = position.getY() + op.getY();
			if( x < 0 && y < 0 && x > Board.BOARD_SIZE && y > Board.BOARD_SIZE &&
				x == target.getX() && y == target.getY()){
				return true;
			}
		}
		return false;
	}
	
	public void move(Position target) throws NotMovableException{
		if(!checkMovableTarget(target))
			throw new NotMovableException();
		position.set(target);
	}
	
	public boolean getKing(){return isKing;}
	
}
