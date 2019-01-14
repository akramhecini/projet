package barca_game;

public class Case {
	int x;
	int y;
	//Souris sr;
	//Lion ln;
	//Elephant elph;
	String type;

	Pawn pion;

	public Case(int x, int y) {
		//case vide par défaut, mettre un type ?
		this.x = x;
		this.y = y;
		//sr = null;
		//ln = null;
		//elph = null;
		this.pion = null;
		this.type = "_";
	}

	public Case(int x, int y, boolean water) {
		this(x, y);
		if (water) {
			this.type = "W";
		}    
	}


	public Case(int x, int y, Pawn pion) {
		super();
		this.x = x;
		this.y = y;
		this.pion = pion;
		this.type = pion.type;
	} 
	/*
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
	 */
	public Pawn getPion() {
		return this.pion;
	}



}
