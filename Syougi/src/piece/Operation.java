package piece;

import common.Position;

public class Operation {
	private Position position;
	private Position target;
	private Piece piece;
	public Operation(Position position,Position targer){
		this.position = position;
		this.target = targer;
		this.piece = null;
	}
	public Operation(Piece piece,Position targer){
		this.piece = piece;
		this.target = targer;
		this.position = null;
	}
	public Position getPosition(){
		if(position == null)return null;
		return position.clone();
	}
	public Position getTarget(){
		if(target == null)return null;
		return target.clone();
	}
	public Piece getPiece(){
		if(piece == null)return null;
		return piece.clone();
	}
}
