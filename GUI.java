package barca_game;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;



class Gestion_case implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		return;
	}
	
}

//iconfinder
public class GUI extends JFrame{
	
	Container contenu;
	ImageIcon wlion = new ImageIcon("white_li.png");;

	
	static int nrow = 10;
	static int ncol = 10;
	static JButton cases[][] = new JButton[nrow][ncol];
	Color black = Color.BLACK;
	
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
	    
	    //test
	    cases[2][3].setIcon(wlion);
	    
	    setSize(1000,1000);
	    setVisible(true);
	    /*
	    main.setVisible(true);
	    main.setDefaultCloseOperation(main.EXIT_ON_CLOSE);
	    main.setSize(600,700);
		*/
	
	}

}