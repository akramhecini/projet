package barca_game;

public class Elephant extends Pawn {

	public Elephant (int x, int y, String type, boolean player1){
		super(x,y, type, player1);
	}
	
	
	
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
    	
    	int lim_x = board.nrow - 1;
        int lim_y = board.nrow - 1;
    	
        if(toX == fromX && toY == fromY)
            return false; 
        
        if (toX < 0 || toX > lim_x || fromX < 0 || fromX > lim_x || toY < 0 || toY > lim_y || fromY < 0 || fromY > lim_y)
            return false;
        
        if(toX == fromX || toY == fromY) 
        	return false; 
        
        if(board.matrice[toX-1][toY].sr.type != "S" || board.matrice[toX+1][toY].sr.type != "S")
        	return false;
        if(board.matrice[toX][toY-1].sr.type != "S" || board.matrice[toX][toY+1].sr.type != "S")
        	return false;
        
        
        
        return true;
    }



	@Override
	public void SeDeplacer(Plateau board, int From_x, int From_y, int to_x, int to_y) {
		// TODO Auto-generated method stub
		
	}
	
	
}
