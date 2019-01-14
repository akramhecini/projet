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
	        //int lim_x = board.nrow;
	        //int lim_y = board.nrow;
	        
	    	//rester sur place
	        if (toX == fromX && toY == fromY)
	            return false; 

	        if ((inBoard(board, fromX, fromY) == false) || (inBoard(board, toX, toY) == false))
	            return false;
	        
	        return true;
	    }
	    
	    public boolean inBoard(Plateau board, int x, int y) {
	    	int lim_x = board.nrow;
	        int lim_y = board.nrow;
	        if (x < 0 || x > lim_x || y < 0 || y > lim_y) {
	        	return false;
	        }
	        return true;
	    }
	    
	    public boolean MovementPerpendic(Plateau board, int fromX, int fromY, int toX, int toY){
	    	//verifie si un mouvement horizontal ou vertical est correct
	    	//le caractere out of bound a du etre verifie au prealable
	    	
	    	//mouvement non horizontal
	    	if(toX != fromX && toY != fromY) 
	        	return false; 
	    	
	    	// piece sur le chemin + sur la case d arrivee
	    	for(int i = 0; i <= toX; i++) {
	    		if (board.matrice[i][fromY].pion != null)
	    			return false;
	    	}
	    	for(int j = 0; j <= toX; j++) {
	    		if (board.matrice[fromX][j].pion != null)
	    			return false;
	    	}
	    	
	    	return true;
	    }
	    
	    public boolean MovementDiag(Plateau board, int fromX, int fromY, int toX, int toY){
	    	//verifie si un mouvement diagonal est correct
	    	//le caractere out of bound a du etre verifie au prealable
	    	
	    	//mouvement non diagonal
	    	if (Math.abs(toX-fromX) != Math.abs(toY-fromY)) 
	        	return false; 
	    	
	    	// piece sur le chemin + sur la case d arrivee A IMPLEMENTER
	    	/*
	    	for(int i = 0; i <= toX; i++) {
	    		if (board.matrice[i][fromY].pion != null)
	    			return false;
	    	}
	    	for(int j = 0; j <= toX; j++) {
	    		if (board.matrice[fromX][j].pion != null)
	    			return false;
	    	}
	    	*/
	    	return true;
	    }
	    
	    abstract public void SeDeplacer (Plateau board, int From_x, int From_y, int to_x, int to_y);

	}
