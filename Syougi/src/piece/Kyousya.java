package piece;

import java.util.ArrayList;
import java.util.List;

import board.Board;
import common.Position;

public class Kyousya extends Piece{

	public Kyousya(Position position) {
		super(position);
		name = 'çÅ';
		
		List<Position> moveoperation = new ArrayList<>();
		for(int i=1;i<Board.BOARD_SIZE;i++){
			moveoperation.add(new Position(0,i));
		}
		setMoveOperation(moveoperation);
	}
	
}
