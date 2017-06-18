package board;

import common.Position;
import exception.NotMovableException;
import piece.Piece;

public class Operation {
	private Piece piece;
	private Position target;
	public Operation(Piece piece,Position targer) throws NotMovableException{
		this.piece = piece;
		this.target = targer;
		
		if(!piece.checkMovableTarget(target)){
			throw new NotMovableException();
		}
	}
	public Piece getPiece(){return piece;}
	public Position getPosition(){return target;}
}
