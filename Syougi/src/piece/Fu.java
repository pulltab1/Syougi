package piece;

import java.util.ArrayList;
import java.util.List;

import common.Position;

public class Fu extends Piece{

	public Fu(Position position) {
		super(position);
		name = '•à';
		List<Position> moveoperation = new ArrayList<>();
		moveoperation.add(new Position(0,1));
		setMoveOperation(moveoperation);
	}
	
}
