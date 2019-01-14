package barca_game;

public class Plateau {

	int nrow = 10;
	int ncol = 10;
	
	public Case[][] matrice = new Case[nrow][ncol];

	public Plateau() {
		// plateau par defaut
		for(int i=0; i<matrice.length; i++){
			for(int j=0; j<matrice.length; j++){
				this.matrice[i][j] = new Case(i, j);
			}
		}
		this.Initialiser();
	}
	
	public Plateau(int nrow, int ncol) {
		//plateau de taille variable
		this.nrow = nrow;
		this.ncol = ncol;
		this.matrice = new Case[nrow][ncol];
		for(int i = 0; i < nrow; i++){
			for(int j = 0; j < ncol; j++){
				this.matrice[i][j] = new Case(i, j);
			}
		}
		this.Initialiser(this.nrow,this.ncol);
	}

	public void Initialiser(){
		//plateau classique hard_coded

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
		
		System.out.println("plateau initialisé en mode classique");
	}
	
	public void Initialiser(int nrow, int ncol){
		//generalisation a nrow,ncol, seulemnt si ces deux sont pairs

		// PREMIER JOUEUR
		matrice[0][(ncol/2) - 2] = new Case(0,(ncol/2) - 2,new Lion(0,(ncol/2) - 2, "L", true));
		matrice[0][(ncol/2) + 1] = new Case(0,(ncol/2) + 2,new Lion(0,(ncol/2) + 2,"L", true));
		matrice[0][(ncol/2) - 1] = new Case(0,(ncol/2) - 1,new Souris(0,(ncol/2) - 1,"S", true));
		matrice[0][ncol/2] = new Case(0,(ncol/2),new Souris(0,(ncol/2),"S", true));
		matrice[1][(ncol/2) - 1] = new Case(1,(ncol/2) - 1,new Elephant(1,(ncol/2) - 1,"E", true));
		matrice[1][ncol/2] = new Case(1,ncol/2,new Elephant(1,ncol/2,"E", true));

		// DEUXIEME JOUEUR : 

		matrice[nrow - 1][(ncol/2) - 2] = new Case(nrow - 1, (ncol/2) - 2,new Lion(nrow - 1,(ncol/2) - 2,"L", false));
		matrice[nrow - 1][(ncol/2) + 1] = new Case(nrow - 1, (ncol/2) + 1, new Lion(nrow - 1, (ncol/2) + 1, "L", false));
		matrice[nrow - 1][(ncol/2) - 1] = new Case(nrow - 1, (ncol/2) - 1, new Souris(nrow - 1, (ncol/2) - 1, "S", false));
		matrice[nrow - 1][ncol/2] = new Case(nrow - 1, ncol/2, new Souris(nrow - 1, ncol/2, "S", false));
		matrice[nrow - 2][(ncol/2) - 1] = new Case(nrow - 2, (ncol/2) - 1, new Elephant(nrow - 2, (ncol/2) - 1, "E", false));
		matrice[nrow - 2][ncol/2] = new Case(nrow - 2, ncol/2, new Elephant(nrow - 2, ncol/2, "E", false));

		
		// EAU 
		matrice[(ncol/2) - 2][(ncol/2) - 2] = new Case((ncol/2) - 2,(ncol/2) - 2,true);
		matrice[(ncol/2) - 2][(ncol/2) + 2] = new Case((ncol/2) - 2,(ncol/2) + 2,true);
		matrice[(ncol/2) + 2][(ncol/2) - 2] = new Case((ncol/2) + 2,(ncol/2) - 2,true);
		matrice[(ncol/2) + 2][(ncol/2) + 2] = new Case((ncol/2) + 2,(ncol/2) + 2,true);
		
		System.out.println("plateau initialisé en mode classique");
	}
	
	public void InitialiserCoin(int nrow, int ncol){
		//Pieces commencent dans les coins

		// PREMIER JOUEUR
		matrice[0][0] = new Case(0,0,new Lion(0,0, "L", true));
		matrice[0][ncol - 1] = new Case(0,ncol - 1,new Lion(0,ncol - 1,"L", true));
		matrice[0][1] = new Case(0,1,new Souris(0,1,"S", true));
		matrice[0][ncol - 2] = new Case(0,ncol - 2,new Souris(0,ncol - 2,"S", true));
		matrice[1][0] = new Case(1,0,new Elephant(1,0,"E", true));
		matrice[1][ncol - 1] = new Case(1,ncol - 1,new Elephant(1,ncol - 1, "E", true));

		// DEUXIEME JOUEUR : 

		matrice[nrow - 1][0] = new Case(nrow - 1, 0,new Lion(nrow - 1, 0,"L", false));
		matrice[nrow - 1][ncol - 1] = new Case(nrow - 1, ncol- 1, new Lion(nrow - 1, ncol - 1, "L", false));
		matrice[nrow - 1][1] = new Case(nrow - 1, 1, new Souris(nrow - 1, 1, "S", false));
		matrice[nrow - 1][ncol - 2] = new Case(nrow - 1, ncol-2, new Souris(nrow - 1, ncol-2, "S", false));
		matrice[nrow - 2][0] = new Case(nrow - 2, 0, new Elephant(nrow - 2, 0, "E", false));
		matrice[nrow - 2][ncol - 1] = new Case(nrow - 2, ncol - 1, new Elephant(nrow - 2, ncol - 1, "E", false));

		
		// EAU 
		matrice[(ncol/2) - 2][(ncol/2) - 2] = new Case((ncol/2) - 2,(ncol/2) - 2,true);
		matrice[(ncol/2) - 2][(ncol/2) + 2] = new Case((ncol/2) - 2,(ncol/2) + 2,true);
		matrice[(ncol/2) + 2][(ncol/2) - 2] = new Case((ncol/2) + 2,(ncol/2) - 2,true);
		matrice[(ncol/2) + 2][(ncol/2) + 2] = new Case((ncol/2) + 2,(ncol/2) + 2,true);
		
		System.out.println("plateau initialisé en mode classique");
	}

	public void afficher(){
		for(int i = 0; i < this.nrow; i++){
			for(int j = 0; j < this.ncol; j++){
				System.out.print(this.matrice[i][j].type);
			}
			System.out.println();
		}
	} 

	public Case getSpot(int x, int y) {
		return matrice[x][y];
	}


}
