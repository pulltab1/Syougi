package main;

import AI.Nasuo;
import AI.PlayerControl;
import board.Game;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Game game = new Game();
		PlayerControl player1 = new PlayerControl(false);
		Nasuo player2 = new Nasuo(true);
		game.joinPlayer(player1);
		game.joinPlayer(player2);
		game.play();
		
	}
}
