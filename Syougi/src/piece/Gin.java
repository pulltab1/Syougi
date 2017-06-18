package piece;

import java.util.ArrayList;
import java.util.List;

import common.Position;

public class Gin extends Piece{

	public Gin(Position position) {
		super(position);
		name = '‹â';
		List<Position> moveoperation = new ArrayList<>();
		moveoperation.add(new Position(-1,1));
		moveoperation.add(new Position(0,1));
		moveoperation.add(new Position(1,1));
		moveoperation.add(new Position(-1,-1));
		moveoperation.add(new Position(1,-1));
		setMoveOperation(moveoperation);
	}
	
}
