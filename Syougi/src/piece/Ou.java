package piece;

import java.util.ArrayList;
import java.util.List;

import common.Position;

public class Ou extends Piece{

	public Ou(Position position) {
		super(position);
		name = '��';
		isKing = true;
		
		List<Position> moveoperation = new ArrayList<>();
		moveoperation.add(new Position(-1,1));
		moveoperation.add(new Position(0,1));
		moveoperation.add(new Position(1,1));
		moveoperation.add(new Position(-1,0));
		moveoperation.add(new Position(1,0));
		moveoperation.add(new Position(-1,-1));
		moveoperation.add(new Position(0,-1));
		moveoperation.add(new Position(1,-1));
		setMoveOperation(moveoperation);
	}

	
}