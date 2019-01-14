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


		bouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				MenuJeu zd = new MenuJeu(null, "Configuration d'une partie", true);
				Barca zInfo = zd.showZDialog(); 
				JOptionPane jop = new JOptionPane();
			}         
		});   
		
		private JRadioButton tranche1, tranche2, tranche3, tranche4;
	JRadioButton row8, row10, row12, row14;
	JRadioButton col8, col10, col12, col14;
	JRadioButton vsplayer, vscomputer;
	JRadioButton pos1, pos2, pos3, pos4;
	static ActionListener start_game = null;

	ArrayList<Button> ListButtonPlayer1 = new ArrayList<Button>();
	ArrayList<Button> ListButtonPlayer2 = new ArrayList<Button>();





	public MenuJeu(JFrame parent, String title, boolean modal){
		super(parent, title, modal);
		this.setSize(750, 500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.initComponent();
	}


	static 	ArrayList creation_SousListe(int y, int x, Piece piece) {
		ArrayList SousListe = new ArrayList();
		SousListe.add(x);
		SousListe.add(y);
		SousListe.add(piece);
		return SousListe;
	}

	private void initComponent(){

		//Choix adversaire
		JPanel conteneurOpponent = new JPanel();
		panIA.setPreferredSize(new Dimension(500, 80));
		vsplayer = new JRadioButton("VS PLAYER");
		vscomputer = new JRadioButton("VS COMPUTER");
		vsplayer.setSelected(true);
		
		ButtonGroup opponent = new ButtonGroup();
		opponent.add(vsplayer);
		opponent.add(vsplayer);
		
		conteneurOpponent.add(vsplayer);
		conteneurOpponent.add(vscomputer);


		//Nombre de Lignes
		JPanel conteneurRow = new JPanel();
		conteneurRow.setPreferredSize(new Dimension(500, 80));
		row8 = new JRadioButton("8");
		row10 = new JRadioButton("10");
		row12 = new JRadioButton("12");
		row14 = new JRadioButton("14");
		row10.setSelected(true);
		
		ButtonGroup lignes = new ButtonGroup();
		lignes.add(row8);
		lignes.add(row10);
		lignes.add(row12);
		lignes.add(row14);
		conteneurRow.add(row8);
		conteneurRow.add(row10);
		conteneurRow.add(row12);
		conteneurRow.add(row14);

		//Nombre de Colonnes
		JPanel conteneurCol = new JPanel();
		conteneurCol.setPreferredSize(new Dimension(500, 80));
		col8 = new JRadioButton("8");
		col10 = new JRadioButton("10");
		col12 = new JRadioButton("12");
		col14 = new JRadioButton("14");
		col10.setSelected(true);
			
		ButtonGroup colonnes = new ButtonGroup();
		colonnes.add(col8);
		colonnes.add(col10);
		colonnes.add(col12);
		colonnes.add(col14);
		conteneurCol.add(col8);
		conteneurCol.add(col10);
		conteneurCol.add(col12);
		conteneurCol.add(col14);

		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.add(conteneurOpponent);
		content.add(conteneurRow);
		content.add(conteneurCol);


		JPanel control = new JPanel();
		JButton okBouton = new JButton("OK");



		launch_game = new ActionListener(){

			public void actionPerformed(ActionEvent e) {        
				
					//        	System.out.println(getColonnes());	
					if (Barca.fenetre!=null) {
						Barca.fenetre.setVisible(false);
						Barca.fenetre.dispose();
					}


					int  nrow = getLignes();
					int ncol = getColonnes();
					int factor = (int) ((min_taille/Math.max(getColonnes(),getLignes())) * ((float)getTaille()/100))-10;


					if (getPos() == 1)	{			
						CoordPlayer1.add(creation_SousListe(0,(ncol/2)-1,e_1_1));
						CoordPlayer1.add(creation_SousListe(0,(ncol/2),e_1_2));
						CoordPlayer1.add(creation_SousListe(0,(ncol/2)-2,l_1_1));
						CoordPlayer1.add(creation_SousListe(0,(ncol/2)+1,l_1_2));
						CoordPlayer1.add(creation_SousListe(1,(ncol/2)-1,m_1_1));
						CoordPlayer1.add(creation_SousListe(1,(ncol/2),m_1_2));

						CoordPlayer2.add(creation_SousListe((nrow-1),(ncol/2)-1,e_2_1));
						CoordPlayer2.add(creation_SousListe((nrow-1),(ncol/2),e_2_2));
						CoordPlayer2.add(creation_SousListe((nrow-1),(ncol/2)-2,l_2_1));
						CoordPlayer2.add(creation_SousListe((nrow-1),(ncol/2)+1,l_2_2));
						CoordPlayer2.add(creation_SousListe((nrow-2),(ncol/2)-1,m_2_1));
						CoordPlayer2.add(creation_SousListe((nrow-2),(ncol/2),m_2_2));
					}




					int nb_round=0;
					zInfo = new Barca(getColonnes(),getLignes(),
							(int) ((min_taille/Math.max(getColonnes(),getLignes())) * ((float)getTaille()/100))-10,
							CoordPlayer1,CoordPlayer2,nb_round,getIA(),gettypeIA());
				
				setVisible(false);
			}

			Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize(); 
			

			

			public boolean getIA(){
				boolean avec_ia = false;
				return (button_ia_1.isSelected()) ? avec_ia = false : 
					(button_ia_2.isSelected()) ? avec_ia = true : 
						(button_ia_3.isSelected()) ? avec_ia = true : 
						avec_ia;  
			}
			
			

			public int getPos(){
				int pos = 0;
				return (pos1.isSelected()) ? pos = 1 : 
					(pos2.isSelected()) ? pos = 2: 
						(pos3.isSelected()) ? pos = 3 : 
							(pos4.isSelected()) ? pos = 4 : 
								pos;  
			}

			public int getLignes(){
				return (row8.isSelected()) ? 8 : 
					(row10.isSelected()) ? 10 : 
						(row12.isSelected()) ? 12 : 
							(row14.isSelected()) ? 14 : 
								Integer.parseInt(tranche3_1.getText());  
			}

			public int getColonnes(){
				return (tranche1_2.isSelected()) ?  Integer.parseInt(tranche1_2.getText()) : 
					(tranche2_2.isSelected()) ?  Integer.parseInt(tranche2_2.getText()) : 
						(tranche3_2.isSelected()) ?  Integer.parseInt(tranche3_2.getText()) : 
							(tranche4_2.isSelected()) ?  Integer.parseInt(tranche4_2.getText()) : 
								Integer.parseInt(tranche3_2.getText());  
			}


		};
		okBouton.addActionListener(start_game);

		JButton cancelBouton = new JButton("Annuler");
		cancelBouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}      
		});

		control.add(okBouton);
		control.add(cancelBouton);




		this.getContentPane().add(content, BorderLayout.CENTER);
		this.getContentPane().add(control, BorderLayout.SOUTH);
	}  
		 */
		
		
		this.setVisible(true);      
	}

	public static void main(String[] main){
		Options menu = new Options();
	}   


}
