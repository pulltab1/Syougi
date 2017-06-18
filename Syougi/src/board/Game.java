package board;


import exception.PlayerFullException;

public class Game {
	public static final int MAX_PLAYER = 2;
	private Board board = new Board();
	private Player[] player = new Player[MAX_PLAYER];
	private int playerCount;
	
	public Game(){
	}
	
	public int getPlayerCount(){return playerCount;}
	public void joinPlayer(Player player) throws PlayerFullException, CloneNotSupportedException{
		if(playerCount >= MAX_PLAYER)throw new PlayerFullException();
		this.player[playerCount] = player.clone();
		playerCount++;
	}
	public int play(){
		for(int i=0;i<MAX_PLAYER;i++){player[i].setup();}
		while(true){
			for(int i=0;i<MAX_PLAYER;i++){
				player[i].turn();
				
			}
		}
	}
}
