package piece;

import java.util.ArrayList;
import java.util.List;

import board.Board;
import common.Position;

public class Kaku extends Piece{

	public Kaku(Position position) {
		super(position);
		name = 'Šp';
		
		List<Position> moveoperation = new ArrayList<>();
		for(int i=1;i<Board.BOARD_SIZE;i++){
			moveoperation.add(new Position(-i,i));
			moveoperation.add(new Position(i,i));
			moveoperation.add(new Position(-i,-i));
			moveoperation.add(new Position(i,i));
		}
		setMoveOperation(moveoperation);
	}
	
}
