package barca_game;

public class Plateau {

	int nrow = 10;
	int ncol = 10;
	
	public Case[][] matrice = new Case[nrow][ncol];

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
		matrice[0][3] = new Case(0,3,new Lion(0,3, "L", true));
		matrice[0][6] = new Case(0,6,new Lion(0,6,"L", true));
		matrice[0][4] = new Case(0,4,new Souris(0,4,"S", true));
		matrice[0][5] = new Case(0,5,new Souris(0,5,"S", true));
		matrice[1][4] = new Case(1,4,new Elephant(1,4,"E", true));
		matrice[1][5] = new Case(1,5,new Elephant(1,5,"E", true));

		// DEUXIEME JOUEUR : 

		matrice[9][3] = new Case(9,3,new Lion(9,3,"L", false));
		matrice[9][6] = new Case(9,6,new Lion(9,6,"L", false));
		matrice[9][4] = new Case(9,4,new Souris(9,4,"S", false));
		matrice[9][5] = new Case(9,5,new Souris(9,5,"S", false));
		matrice[8][4] = new Case(8,4,new Elephant(8,4,"E", false));
		matrice[8][5] = new Case(8,5,new Elephant(8,5,"E", false));

		
		// EAU 
		matrice[3][3] = new Case(3,3,true);
		matrice[3][6] = new Case(3,6,true);
		matrice[6][3] = new Case(6,3,true);
		matrice[6][6] = new Case(6,6,true);


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
