package barca_game;

import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GridInterface extends JPanel{
	
	GridInterface(GraphicInterface ginterface){
		int nrow = ginterface.nrow;
		int ncol = ginterface.ncol;
		
		//this.setLayout(new GridLayout(ginterface.nrow,ginterface.ncol));
		//ImageIcon icone = new ImageIcon("/home/sdv/m1bi/lyang_crosson/Images/index.jpeg");
		//ImageIcon icone = new ImageIcon(ImageIO.read(new File("white_el.svg")));
		ImageIcon icone = new ImageIcon("white_el.svg");
		/*
		for (int i = 0; i <= nrow; i++) {
			for (int j =0; i<= ncol; j++) {
				
			}
			
		}*/
		JButton test = new JButton("test", icone);
		//test.setMargin(new Insets(10,10,10,10));
		this.add(test);
		System.out.println(icone.getIconWidth());
		
		
	}
}
