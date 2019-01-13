package barca_game;

public class Lion extends Pawn {

	public Lion (int x, int y, String type, boolean player1){
		super(x,y, type, player1);
	}
	
	
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
    	
    	int lim_x = board.nrow - 1;
        int lim_y = board.nrow - 1;
    	
        if(toX == fromX && toY == fromY)
            return false; 
        
        if (toX < 0 || toX > lim_x || fromX < 0 || fromX > lim_x || toY < 0 || toY > lim_y || fromY < 0 || fromY > lim_y)
            return false;
        
        //deplacement non diagonal
        if(toX == fromX || toY == fromY) 
        	return false; 
        //mettre restriction ur diagonale
        
        if(board.matrice[toX-1][toY].elph.type != "E" || board.matrice[toX+1][toY].elph.type != "E")
        	return false;
        if(board.matrice[toX][toY-1].elph.type != "E" || board.matrice[toX][toY+1].elph.type != "E")
        	return false;
        
        
        
        return true;
    }


	@Override
	public void SeDeplacer(Plateau board, int From_x, int From_y, int to_x, int to_y) {
		// TODO Auto-generated method stub
		
	}
	
}
