package main;

import AI.Nasuo;
import board.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Game game = new Game();
		Nasuo player1 = new Nasuo();
		Nasuo player2 = new Nasuo();
		game.joinPlayer(player1);
		game.joinPlayer(player2);
		game.play();
	}

}
