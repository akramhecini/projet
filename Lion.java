package projet;

public class Lion extends Pawn {

	public Lion ( int x, int y, String type){
		super(x,y,type);
	}
	
	
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
    	
        if(toX == fromX && toY == fromY)
            return false; 
        
        if(toX < 0 || toX > 9 || fromX < 0 || fromX > 9 || toY < 0 || toY > 9 || fromY <0 || fromY > 9)
            return false;
        
        if(toX == fromX || toY == fromY) 
        	return false; 
        
        if(board.matrice[toX-1][toY].elph.type != "E" || board.matrice[toX+1][toY].elph.type != "E")
        	return false;
        if(board.matrice[toX][toY-1].elph.type != "E" || board.matrice[toX][toY+1].elph.type != "E")
        	return false;
        
        
        
        return true;
    }
	
}
