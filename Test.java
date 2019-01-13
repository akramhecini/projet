package barca_game;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plateau p = new Plateau();
		p.afficher();
		//p.matrice[0][4].sr.SeDeplacer(p, 0, 4, 5, 4);
		
		p.matrice[0][4].pion.SeDeplacer(p, 0, 4, 5, 4);
		p.afficher();
		System.out.println("fin programme");
		
		

	}

}
