package barca_game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cases extends JButton implements ActionListener{
	ImageIcon White_e =  new ImageIcon("white_el.png");
	
	public Cases(){
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		setIcon(White_e);
	}
}
