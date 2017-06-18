package piece;

import java.util.ArrayList;
import java.util.List;

import board.Board;
import common.Position;

public class Hisya extends Piece{

	public Hisya(Position position) {
		super(position);
		name = '”ò';
		
		List<Position> moveoperation = new ArrayList<>();
		for(int i=1;i<Board.BOARD_SIZE;i++){
			moveoperation.add(new Position(0,i));
			moveoperation.add(new Position(0,-i));
			moveoperation.add(new Position(i,0));
			moveoperation.add(new Position(-i,0));
		}
		setMoveOperation(moveoperation);
	}
	
}
