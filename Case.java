package barca_game;

public class Case {
	 int x;
	 int y;
	 Souris sr;
	 Lion ln;
	 Elephant elph;
	 String type;
	 
	 //Pawn pion;

	    public Case(int x, int y) {
	    	//case vide par défaut
	        this.x = x;
	        this.y = y;
	        sr = null;
	        ln = null;
	        elph = null;
	    }
	    
	    public Case(int x, int y, boolean water) {
	    	this.x = x;
	        this.y = y;
	        sr = null;
	        ln = null;
	        elph = null;
	        
	    	if (water) {
	    		this.type = "W";
	    	}    
	    }
	    
	    /*
	    public Case(int x, int y, Pawn pion) {
	        super();
	        this.x = x;
	        this.y = y;
	        piece = pion;
	    } */

	    public Case(int x, int y, Souris pion) {
	        this.x = x;
	        this.y = y;
	        sr = pion;
	        this.type = "S";
	    }
	    
	    public Case(int x, int y, Lion pion) {
	        this.x = x;
	        this.y = y;
	        ln = pion;
	        this.type = "L";
	    }
	    
	    public Case(int x, int y, Elephant pion) {
	        this.x = x;
	        this.y = y;
	        elph = pion;
	        this.type = "E";
	    }
	    
	    //public getPion() {}
	    
	    
    
}
