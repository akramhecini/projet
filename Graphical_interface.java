package barca_game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class Graphical_interface extends JPanel {
	BufferedImage img;
	Graphics g_img;
	int height; //pour effacer
	int width;
	int nrow;
	int ncol;
	
	Graphical_interface(int largeur, int hauteur, int nrow, int ncol){
		this.height=hauteur;
		this.width=largeur;
		this.setPreferredSize(new Dimension(largeur,hauteur));
		this.setBackground(Color.DARK_GRAY);
		this.img = new BufferedImage(largeur,hauteur,1); //int_RGB ?
		this.g_img = img.getGraphics();
		
		this.nrow = nrow; //11 bugge //en faire une var de classe ?
		this.ncol = ncol;
		//Donner nb de cases après
		this.g_img.setColor(Color.WHITE);
		boolean iswhite = true; //or change current color
		for (int i = 0; i <= largeur; i+= largeur/nrow) {
			for (int j =0; j <= hauteur; j+= hauteur/ncol) {
				
				if (iswhite){
					this.g_img.drawRect(i, j, this.width/nrow, this.height/ncol);
					this.g_img.fillRect(i, j, this.width/nrow, this.height/ncol);
					iswhite = false;
				}
				else {
					iswhite = true;
				}
				
				
			}	
		}
		//this.g_img.drawRect(0, 0, this.width/10, this.height/10);
		//this.g_img.fillRect(0, 0, this.width/10, this.height/10);
		
		//this.g_img.drawLine(400,400,100,100); //faire relatif a taille
		/*
		this.g_img.drawOval(350,200,40,40);
		this.g_img.drawOval(650,200,40,40);
		this.g_img.drawArc(350, 250, 350, 200, 180, 180);
		*/
		
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


