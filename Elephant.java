package projet;

public class Elephant extends Pawn {

	public Elephant ( int x, int y, String type){
		super(x,y, type);
	}
	
	
	
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
    	
        if(toX == fromX && toY == fromY)
            return false; 
        
        if(toX < 0 || toX > 9 || fromX < 0 || fromX > 9 || toY < 0 || toY > 9 || fromY <0 || fromY > 9)
            return false;
        
        if(toX == fromX || toY == fromY) 
        	return false; 
        
        if(board.matrice[toX-1][toY].sr.type != "S" || board.matrice[toX+1][toY].sr.type != "S")
        	return false;
        if(board.matrice[toX][toY-1].sr.type != "S" || board.matrice[toX][toY+1].sr.type != "S")
        	return false;
        
        
        
        return true;
    }
	
	
}
