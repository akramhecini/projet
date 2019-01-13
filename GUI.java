package barca_game;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/*
class Gestion_case implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		return;
	}
}
*/

public class GUI extends JFrame{
	
	Container contenu;
	
	//iconfinder
	ImageIcon wlion = new ImageIcon("white_li.png");
	ImageIcon blion = new ImageIcon("black_li.png");
	ImageIcon weleph = new ImageIcon("white_el.png");
	ImageIcon beleph = new ImageIcon("black_el.png");
	ImageIcon wmouse = new ImageIcon("white_mo.png");
	ImageIcon bmouse = new ImageIcon("black_mo.png");
	ImageIcon water = new ImageIcon("water.png");
	
	static int nrow = 10;
	static int ncol = 10;
	static JButton cases[][] = new JButton[nrow][ncol];
	Color black = Color.BLACK;
	
	JMenuBar barre_menu = new JMenuBar();
	JMenu fichier = new JMenu("Fichiers");
	JMenuItem fichier1 = new JMenuItem("Nouvelle Partie");
	
	
	public static void main(String[] args)
    {
      GUI gui = new GUI();
      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public GUI (){
		super("plateau");

	    contenu = getContentPane();
	    contenu.setLayout(new GridLayout(nrow, ncol));
	    
	    Gestion_case gcase= new Gestion_case();
	    
	    //coloration des cases et ajout des listeners
	    for (int i = 0; i < nrow; i++) {
			for (int j = 0; j < ncol; j++) {
				cases[i][j] = new JButton();
				if ((i+j) % 2 != 0) {
					cases[i][j].setBackground(black);
				}
				
				contenu.add(cases[i][j]);
				cases[i][j].addActionListener(gcase);
			}
		}
	    
	    this.Peupler(cases);
	    //ajout des menus
	    fichier.add(fichier1);
		barre_menu.add(fichier);
		this.setJMenuBar(barre_menu);
		
		//depend des nom icones
		System.out.println(cases[0][3].getIcon());
		if (cases[0][3].getIcon() == wlion) {
			System.out.println("Lion BLANC");
		}
	    
	    setSize(1000,1000);
	    setVisible(true);

	}
	
	class Gestion_case implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		Object source = e.getSource();
    		for (int i = 0; i < nrow; i++) {
    			for (int j = 0; j < ncol; j++) {
    				if (source == cases[i][j]) {
    					System.out.println(source);
    					System.out.println(cases[i][j].getIcon());
    					Deplacement(i,j);
    					return;
    				}	
    			}
    		}
    	}
    }
	
	public void Deplacement(int i, int j) {
		// Regarde si on se déplace
		//cases[i][j].setIcon(null);
		//cases[i][j].setIcon(null);
		
	}

	public void Peupler(JButton[][] cases) {
		//cas classique
		//generaliser lors de population plateau
	    cases[0][3].setIcon(wlion);
		cases[0][6].setIcon(wlion);
		cases[0][4].setIcon(wmouse);
		cases[0][5].setIcon(wmouse);
		cases[1][4].setIcon(weleph);
		cases[1][5].setIcon(weleph);

		// DEUXIEME JOUEUR : 
		cases[9][3].setIcon(blion);
		cases[9][6].setIcon(blion);
		cases[9][4].setIcon(bmouse);
		cases[9][5].setIcon(bmouse);
		cases[8][4].setIcon(beleph);
		cases[8][5].setIcon(beleph);
		
		cases[3][3].setIcon(water);
		cases[3][6].setIcon(water);
		cases[6][3].setIcon(water);
		cases[6][6].setIcon(water);
	}

}