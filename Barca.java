package barca_game;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Where the game will be launched
 * mouse < lion < elephant < lion (only with the opponent's animals)
 * movement:
 * _mouse : horizontal or vertical ;
 * _lion : diagonal ;
 * _elephant: all directions
 * Animals can't go on a square where they would be scared 
 * If one or more pieces is afraid and can move, the player must move one of the pieces
 * 
 * The games has to be able to be playable against a human or a computer
 * Implementations obligatoires :
 * â€” dimensions et forme du plateau,
 * â€” configuration initiale des pions, parmi un ensemble de configurations,
 * â€” nouvelles sortes de pieces, nouvelles regles pour ces pieces, etc.
 * 
 *  _Votre programme
sera capable de garder en memoire la suite de coups d une partie (complete
ou non), d annuler un ou plusieurs coups parmi les derniers joues, de sau-
vegarder et de recharger cet historique â€“ avec un encodage quelconque, ou
encore, sous la forme d un texte decrivant la suite des coups a  l aide d une
notation claire et complete â€“ de derouler son contenu etape par etape a  la
demande de l utilisateur, de le derouler a  rebours, d aller a  sa fin ou a  son
debut, etc.
 *
 */

/*Default 10 x 10 board
 * 0 1 2 3 4 5 6 7 8 9
 * N N N L E E L N N N 1
 * N N N N M M N N N N 2
 * N N N N N N N N N N 3
 * N N N O N N O N N N 4
 * N N N N N N N N N N 5
 * N N N O N N O N N N 6
 * N N N N N N N N N N 7
 * N N N N M M N N N N 8
 * N N N L E E L N N N 9
 */
public class Barca extends JPanel{
	
	Barca(){
		//GraphicInterface ardoise = new GraphicInterface(1000,800,10,10);
		//this.add(ardoise);
		//GridInterface grid = new GridInterface(ardoise);
		//this.add(grid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Barca");
		Barca panneau = new Barca();
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panneau);
		frame.pack();
		frame.setVisible(true);

	}

}
