package AI;

import board.Board;
import board.Operation;
import board.Player;
import common.Position;
import piece.Ou;
import piece.Piece;

public class Nasuo extends Player{

	@Override
	public void setup() {
	}

	@Override
	public Operation turn() {
		return new Operation(getBoard().get(0),new Position(0,1));
	}

}
