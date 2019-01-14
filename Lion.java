package barca_game;

public class Lion extends Pawn {

	public Lion (int x, int y, String type, boolean player1){
		super(x, y, type, player1);
	}
	
	
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
    	
    	
        if(toX == fromX && toY == fromY)
            return false; 
        
        if ((inBoard(board, fromX, fromY) == false) || (inBoard(board, toX, toY) == false))
            return false;
        
        //deplacement non diagonal
        if (Math.abs(toX-fromX) != Math.abs(toY-fromY)) 
        	return false; 
        
        
        
        //verifier que pas out of bound, ni effrayé par pion ennemi
        if(board.matrice[toX-1][toY].pion.type != "E" || board.matrice[toX+1][toY].pion.type != "E")
        	return false;
        if(board.matrice[toX][toY-1].pion.type != "E" || board.matrice[toX][toY+1].pion.type != "E")
        	return false;
        
        
        
        return true;
    }


	@Override
	public void SeDeplacer(Plateau board, int From_x, int From_y, int to_x, int to_y) {
		// TODO Auto-generated method stub
		
	}
	
}
