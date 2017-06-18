package piece;

import java.util.ArrayList;
import java.util.List;

import common.Position;

public class Keima extends Piece{

	public Keima(Position position) {
		super(position);
		name = '”n';
		List<Position> moveoperation = new ArrayList<>();
		moveoperation.add(new Position(-1,2));
		moveoperation.add(new Position(1,2));
		setMoveOperation(moveoperation);
	}
	
}
