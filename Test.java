package barca_game;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plateau p = new Plateau(12,12);
		p.afficher();
		//p.matrice[0][4].sr.SeDeplacer(p, 0, 4, 5, 4);
		
		p.matrice[0][4].pion.SeDeplacer(p, 0, 4, 8, 4);
		p.afficher();
		
		Pawn tmp = p.matrice[7][3].getPion();
		if (tmp != null)
			System.out.println(tmp.isPlayer1);
		System.out.println("fin programme");
		
		

	}

}
