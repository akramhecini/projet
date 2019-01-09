package barca_game;

public class Plateau {
	
	   public Case[][] matrice = new Case[10][10];

	    public Plateau() {
	       // super();
	        for(int i=0; i<matrice.length; i++){
	            for(int j=0; j<matrice.length; j++){
	                this.matrice[i][j] = new Case(i, j);
	            }
	        }
	        this.Initialiser();
	    }
	    
	    public void Initialiser(){
	    	
	    	// PREMIER JOUEUR
	    	matrice[0][3] = new Case(0,3,new Lion(0,3, "L"));
	    	matrice[0][6] = new Case(0,6,new Lion(0,6,"L"));
	    	matrice[0][4] = new Case(0,4,new Souris(0,4,"S"));
	    	matrice[0][5] = new Case(0,5,new Souris(0,5,"S"));
	    	matrice[1][4] = new Case(1,4,new Elephant(1,4,"E"));
	    	matrice[1][5] = new Case(1,5,new Elephant(1,5,"E"));
	    	
	    	// DEUXIEME JOUEUR : 
	    	
	    	matrice[9][3] = new Case(9,3,new Lion(9,3,"L"));
	    	matrice[9][6] = new Case(9,6,new Lion(9,6,"L"));
	    	matrice[9][4] = new Case(9,4,new Souris(9,4,"S"));
	    	matrice[9][5] = new Case(9,5,new Souris(9,5,"S"));
	    	matrice[8][4] = new Case(8,4,new Elephant(8,4,"E"));
	    	matrice[8][5] = new Case(8,5,new Elephant(8,5,"E"));
	    	
	    	// EAU 
	    	
	    	
	    }
	    
	  public void afficher(){
	        for(int i=0; i<matrice.length; i++){
	            for(int j=0; j<matrice.length; j++){
	            	
	            	if(this.matrice[i][j].sr == null && this.matrice[i][j].ln == null && this.matrice[i][j].elph == null  )
	            		System.out.print(" ");
	            	else{
	            		System.out.print(this.matrice[i][j].type+" ");
	            	}

	            }
	            System.out.println();
	        }
	    } 

	    public Case getSpot(int x, int y) {
	        return matrice[x][y];
	    }
	
	
}
