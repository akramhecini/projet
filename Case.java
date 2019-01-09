package projet;

public class Case {
	 int x;
	 int y;
	 Sourie sr;
	 Lion ln;
	 Elephant elph;
	 String type;

	    public Case(int x, int y) {
	        super();
	        this.x = x;
	        this.y = y;
	        sr = null;
	        ln = null;
	        elph = null;
	    }
	    
	 /*   public Case(int x, int y, Pawn pion) {
	        super();
	        this.x = x;
	        this.y = y;
	        piece = pion;
	    } */

	    public Case(int x, int y, Sourie pion) {
	        super();
	        this.x = x;
	        this.y = y;
	        sr = pion;
	        this.type = "S";
	    }
	    
	    public Case(int x, int y, Lion pion) {
	        super();
	        this.x = x;
	        this.y = y;
	        ln = pion;
	        this.type = "L";
	    }
	    
	    public Case(int x, int y, Elephant pion) {
	        super();
	        this.x = x;
	        this.y = y;
	        elph = pion;
	        this.type = "E";
	    }
	    
	    
	    
	    
}
