package board;

import java.util.ArrayList;
import java.util.List;

import piece.Piece;

public class Inventory implements Cloneable{

	private List<Piece> inventory = new ArrayList<Piece>();
	
	public void add(Piece piece,boolean isOpponent){
		piece.clone();
		inventory.add(new Piece(piece));
	}
	public int indexOf(Piece piece){
		for(int i=0 ; i < inventory.size() ; i++){
			if(inventory.get(i).getClass() == piece.getClass()){
				return i;
			}
		}
		return -1;
	}
	public Piece get(int index){
		return inventory.get(index).clone();
	}
	public Piece remove(int index){
		return inventory.remove(index);
	}
	public void draw(){
		System.out.print("[Inventory]:");
		for(Piece piece : inventory){
	    	System.out.print(piece.getName());
	    }
	
		System.out.println();
	}
	@Override
    public Inventory clone(){
        try {
			return (Inventory)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
    }
}
