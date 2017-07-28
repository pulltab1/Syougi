package piece;

import java.util.ArrayList;
import java.util.List;

import common.Position;

public class Keima extends Piece implements Reversible{

	public Keima(boolean isOpponent) {
		super(isOpponent);
		name = '�n';
		List<Position> moveoperation = new ArrayList<>();
		moveoperation.add(new Position(-1,2));
		moveoperation.add(new Position(0,0));
		moveoperation.add(new Position(1,2));
		setMoveOperation(moveoperation,isOpponent);
	}
	
	@Override
	public void reverse() {
		name = '��';
		List<Position> moveoperation = new ArrayList<>();
		moveoperation.add(new Position(-1,1));
		moveoperation.add(new Position(0,1));
		moveoperation.add(new Position(1,1));
		moveoperation.add(new Position(-1,0));
		moveoperation.add(new Position(1,0));
		moveoperation.add(new Position(0,-1));
		setMoveOperation(moveoperation,isOpponent);
	}
	
}
