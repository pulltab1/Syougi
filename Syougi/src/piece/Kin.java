package piece;

import java.util.ArrayList;
import java.util.List;

import common.Position;

public class Kin extends Piece{

	public Kin(Position position) {
		super(position);
		name = '��';
		
		List<Position> moveoperation = new ArrayList<>();
		moveoperation.add(new Position(-1,1));
		moveoperation.add(new Position(0,1));
		moveoperation.add(new Position(1,1));
		moveoperation.add(new Position(-1,0));
		moveoperation.add(new Position(1,0));
		moveoperation.add(new Position(0,-1));
		setMoveOperation(moveoperation);
	}
	
}
