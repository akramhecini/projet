package barca_game;

abstract public class Pawn {

	    int x;
	    int y;
	    String type;
	    boolean isPlayer1;
	    

	    public Pawn(int x, int y, String type, boolean player1) {
	        this.x = x;
	        this.y = y;
	        this.type = type;
	        this.isPlayer1 = player1;
	    }

	    
	    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
	        int lim_x = board.nrow - 1;
	        int lim_y = board.nrow - 1;
	        
	    	//rester sur place
	        if (toX == fromX && toY == fromY)
	            return false; 

	        if (toX < 0 || toX > lim_x || fromX < 0 || fromX > lim_x || toY < 0 || toY > lim_y || fromY < 0 || fromY > lim_y)
	            return false;
	        
	        return true;
	    }
	    
	    abstract public void SeDeplacer (Plateau board, int From_x, int From_y, int to_x, int to_y);

	}
