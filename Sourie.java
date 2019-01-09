package projet;

public class Sourie extends Pawn {
	
	public Sourie ( int x, int y, String type){
		super(x,y, type);
	}
	
	
	@Override
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
    	
        if(toX == fromX && toY == fromY)
            return false; 
        
        if(toX < 0 || toX > 9 || fromX < 0 || fromX > 9 || toY < 0 || toY > 9 || fromY <0 || fromY > 9)
            return false;
        
        if(toX != fromX && toY != fromY) // elle se deplace pas en diaginal 
        	return false; 
        
        if(board.matrice[toX-1][toY].ln.type != "L" || board.matrice[toX+1][toY].ln.type != "L")
        	return false;
        if(board.matrice[toX][toY-1].ln.type != "L" || board.matrice[toX][toY+1].ln.type != "L")
        	return false;
        
        return true;
    }


	public void SeDeplacer (Plateau board, int From_x, int From_y, int to_x, int to_y){
		boolean reponse = MovementLegal(board, From_x, From_y, to_x, to_y);
		System.out.println(reponse);
		if(reponse == true){
			//board.matrice[From_x][From_y] = new Case(From_x, From_y); // PIECE = NULL
			board.matrice[From_x][From_y].sr = null;
			board.matrice[to_x][to_y] = new Case(to_x, to_y, new Sourie(to_x,to_y, "S"));
			board.afficher();
		}
	} 
	
	
}
