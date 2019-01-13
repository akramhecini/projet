package barca_game;


import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Options extends JFrame {
	// Classe qui donne une frame dans laquelle on choisit les options
	// permet de donner dimensions, config des pieces, nouvelles pieces ?
	
	JRadioButton tranche1, tranche2, tranche3, tranche4;
	JButton bouton = new JButton("Lancer une Partie");
	Container contenu;
	
	JPanel cards;
	public Options(){      
		this.setTitle("Options");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contenu = this.getContentPane();
		GroupLayout layout = new GroupLayout(contenu);
		//contenu.setLayout(new GroupLayout(contenu));
		//contenu.add(bouton, BorderLayout.NORTH);
		JPanel card1 = new JPanel();
		
		//essayer 2 JFrame Options -> Jeu( GUI ?)
		JFrame test = new JFrame();
		test.setVisible(true);
		test.setSize(500, 500);
		test.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //ou DO NOTHING ON CLOSE ?
		//cards = new JPanel(new CardLayout());
		//cards.add(card1, "Test");
		
		/*
		 * 
		 * class Gestion_case implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		for (int i = 0; i < nrow; i++) {
			for (int j = 0; j < ncol; j++) {
				if (source == cases[i][j]) {
					Deplacement(i,j);
					return;
				}	
			}
		}
	}
}


		bouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				MenuJeu zd = new MenuJeu(null, "Configuration d'une partie", true);
				Barca zInfo = zd.showZDialog(); 
				JOptionPane jop = new JOptionPane();
			}         
		});   
		 */
		
		this.setVisible(true);      
	}

	public static void main(String[] main){
		Options menu = new Options();
	}   


}
