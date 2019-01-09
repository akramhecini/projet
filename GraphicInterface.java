package barca_game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GraphicInterface extends JPanel{
	BufferedImage img;
	Graphics g_img;
	int height; //pour effacer
	int width;
	int nrow;
	int ncol;
	
	GraphicInterface(int largeur, int hauteur, int nrow, int ncol){
		
		this.setLayout(new GridLayout(largeur, hauteur));
		
		this.height=hauteur;
		this.width=largeur;
		this.setPreferredSize(new Dimension(largeur,hauteur));
		this.setBackground(Color.DARK_GRAY);
		//this.img = new BufferedImage(largeur,hauteur,1); //int_RGB ?
		//this.g_img=img.getGraphics();
		
		this.nrow = nrow; //11 bugge //en faire une var de classe ?
		this.ncol = ncol;
		
		Cases boutons[][] = new Cases[nrow][ncol];
		//Donner nb de cases après
		ImageIcon icone = new ImageIcon("01a.png");
		
		for (int i = 0; i < nrow; i++) {
			for (int j = 0; j < nrow; j++) {
				boutons[i][j] = new Cases();
				this.add(boutons[i][j]);
			}
		}
		System.out.println(System.getProperty("user.dir"));
		
		
	}
	
	protected void paintComponent(Graphics G){
		//remplace fond par défaut ?
		G.drawImage(img,0,0,Color.CYAN,null); //Donne image ?
	}
	
	Graphics getImageGraphics() {
		return g_img;
	}
	void effacer() {
		g_img.clearRect(0, 0, this.width, this.height);
		repaint();
	}

}
