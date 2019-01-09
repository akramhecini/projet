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
 * — dimensions et forme du plateau,
 * — configuration initiale des pions, parmi un ensemble de configurations,
 * — nouvelles sortes de pièces, nouvelles règles pour ces pièces, etc.
 * 
 *  _Votre programme
sera capable de garder en mémoire la suite de coups d’une partie (complète
ou non), d’annuler un ou plusieurs coups parmi les derniers joués, de sau-
vegarder et de recharger cet historique – avec un encodage quelconque, ou
encore, sous la forme d’un texte décrivant la suite des coups à l’aide d’une
notation claire et complète – de dérouler son contenu étape par étape à la
demande de l’utilisateur, de le dérouler à rebours, d’aller à sa fin ou à son
début, etc.
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
		GraphicInterface ardoise = new GraphicInterface(1000,800,10,10);
		this.add(ardoise);
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
