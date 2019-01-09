package barca_game;

public class Pawn {

	    int x;
	    int y;
	    String type;
	    

	    public Pawn(int x, int y, String type) {
	        this.x = x;
	        this.y = y;
	        this.type = type;
	    }

	    
	    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
	    	
	        if(toX == fromX && toY == fromY)
	            return false; 
	        
	        if(toX < 0 || toX > 9 || fromX < 0 || fromX > 9 || toY < 0 || toY > 9 || fromY <0 || fromY > 9)
	            return false;
	        
	        return true;
	    }

	}
