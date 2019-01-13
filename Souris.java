package barca_game;

public class Souris extends Pawn {
	
	public Souris (int x, int y, String type, boolean player1){
		super(x,y, type, player1);
	}
	
	
	@Override
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
		
		int lim_x = board.nrow - 1;
        int lim_y = board.nrow - 1;
    	
        if(toX == fromX && toY == fromY)
            return false; 
        
        if (toX < 0 || toX > lim_x || fromX < 0 || fromX > lim_x || toY < 0 || toY > lim_y || fromY < 0 || fromY > lim_y)
            return false;
        
        if(toX != fromX && toY != fromY) // elle se deplace pas en diagonale
        	return false; 
        
        /*
        if(board.matrice[toX-1][toY].ln.type != "L" || board.matrice[toX+1][toY].ln.type != "L")
        	return false;
        
        if(board.matrice[toX][toY-1].ln.type != "L" || board.matrice[toX][toY+1].ln.type != "L")
        	return false;
        */
        return true;
    }


	public void SeDeplacer (Plateau board, int From_x, int From_y, int to_x, int to_y){
		boolean reponse = MovementLegal(board, From_x, From_y, to_x, to_y);
		System.out.println(reponse);
		if(reponse == true){
			//board.matrice[From_x][From_y] = new Case(From_x, From_y); // PIECE = NULL
			board.matrice[From_x][From_y].sr = null;
			board.matrice[to_x][to_y] = new Case(to_x, to_y, new Souris(to_x,to_y, "S", isPlayer1));
			board.afficher();
		}
	} 
	
	
}
