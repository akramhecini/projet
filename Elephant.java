package barca_game;

public class Elephant extends Pawn {

	public Elephant (int x, int y, String type, boolean player1){
		super(x, y, type, player1);
	}
	
	
	
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
    	
        if(toX == fromX && toY == fromY)
            return false; 
        
        if ((inBoard(board, fromX, fromY) == false) || (inBoard(board, toX, toY) == false))
            return false;
        
        if(toX == fromX || toY == fromY) 
        	return false; 
        
        if(board.matrice[toX-1][toY].pion.type != "S" || board.matrice[toX+1][toY].pion.type != "S")
        	return false;
        if(board.matrice[toX][toY-1].pion.type != "S" || board.matrice[toX][toY+1].pion.type != "S")
        	return false;
        
        
        
        return true;
    }



	@Override
	public void SeDeplacer(Plateau board, int From_x, int From_y, int to_x, int to_y) {
		// TODO Auto-generated method stub
		boolean reponse = MovementLegal(board, From_x, From_y, to_x, to_y);
		System.out.println("move legal: " + reponse);
		if(reponse == true){
			//board.matrice[From_x][From_y] = new Case(From_x, From_y); // PIECE = NULL
			Pawn to_move = board.matrice[From_x][From_y].pion;
			
			board.matrice[From_x][From_y].pion = null;
			board.matrice[From_x][From_y].type = "_";
			board.matrice[to_x][to_y] = new Case(to_x, to_y, to_move);
			board.afficher();
		}
		
	}
	
	
}
