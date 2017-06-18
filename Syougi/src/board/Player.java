package board;

import java.util.ArrayList;
import java.util.List;

import common.Position;
import piece.Fu;
import piece.Ou;
import piece.Piece;

public abstract class Player implements Cloneable{
	public abstract void setup();
	public abstract Operation turn();
	
	private List<Piece> board = new ArrayList<>();
	private List<Piece> inventory = new ArrayList<>();
	
	public Player(){
		getBoard().add(new Ou(new Position(Board.BOARD_SIZE/2 ,0)));
		for(int i=0;i<Board.BOARD_SIZE;i++){
			board.add(new Fu(new Position(i,2)));
		}
	}
	public List<Piece> getBoard(){return board;}
	@Override
    public Player clone() throws CloneNotSupportedException {
        return (Player)super.clone();
    }
	/*
	public void draw(){
		Piece[][] field = this.board.getBoard(); 
		
		for(Piece piece : this.pieces){
			if(piece.getOwner()==number){
				field[piece.getY()][piece.getX()] = piece;
			}
			else{
				field[Board.BOARD_SIZE-piece.getY()-1][Board.BOARD_SIZE-piece.getX()-1] = piece;
			}
		}
		for(int i = 0 ; i < field.length ; i++){
			for(int j = 0 ; j < field[0].length ; j++){
				if(field[i][j] != null){
					System.out.print(field[i][j].getName());
				}
				else{
					System.out.print('@');
				}
				if(j < field.length - 1){
					System.out.print('|');
				}
			}
			System.out.println();
		}
		System.out.println("player"+number+":");
		for(Piece piece : inventory){
			System.out.print(piece.getName()+" ");
		}
		System.out.println();
	}*/
}
