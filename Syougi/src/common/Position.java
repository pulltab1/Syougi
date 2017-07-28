package common;


public class Position implements Cloneable{
	private int x;
	private int y;

	public Position(int x,int y){
		set(x,y);
	}
	public void set(Position position){
		x = position.getX();
		y = position.getY();
	}
	public void set(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){return x;}
	public int getY(){return y;}
	
	@Override
    public Position clone(){
        try {
			return (Position)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
    }
}
