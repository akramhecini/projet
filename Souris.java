package barca_game;

public class Souris extends Pawn {
	
	public Souris (int x, int y, String type, boolean player1){
		super(x, y, type, player1);
	}
	
	
	@Override
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
		
    	// sur place
        if(toX == fromX && toY == fromY)
            return false; 
        
        // hors plateau
        if ((inBoard(board, fromX, fromY) == false) || (inBoard(board, toX, toY) == false))
            return false;
        
        // mouvement diagonal
        if(toX != fromX && toY != fromY) 
        	return false; 
        
        // case occupée (on peut aussi verifier avec type)
        if(board.matrice[fromX][fromY].pion != null) 
        	return false;
        
        	
        //verifier que case n'est pas un pion, ni effrayé par ennemi
        
        
        //verifier que ne passe pas au dessus de pion: 2 cas : vertical ou horiz
        
        if(fromX == toX){
    	for(int i = 0; i <= toY; i++) {
    		if (board.matrice[fromX][i].pion != null)
    			return false;
    	}}
        
        if(fromY == toY){
    	for(int j = 0; j <= toX; j++) {
    		if (board.matrice[j][toY].pion != null)
    			return false;
    	}}
        
        //lors de verif cases adjacentes, attention au cas si + ou - index est out of bound
        // out of bound est vérifié au sein de la fonction EstPionEffrayant
        
        if(EstPionEffrayant(board,fromX,fromY,toX-1,toY)==true || EstPionEffrayant(board,fromX,fromY,toX+1,toY) ==true)
        	return false;
        
        if(EstPionEffrayant(board,fromX,fromY,toX,toY-1)==true|| EstPionEffrayant(board,fromX,fromY,toX,toY+1) == true)
        	return false;

        if(EstPionEffrayant(board,fromX,fromY,toX-1,toY-1)==false || EstPionEffrayant(board,fromX,fromY,toX+1,toY+1) == false)
        	return false;
        if(EstPionEffrayant(board,fromX,fromY,toX+1,toY-1)==false || EstPionEffrayant(board,fromX,fromY,toX-1,toY+1) == false)
        	return false;
        
        
        
        /*
        if(board.matrice[toX-1][toY].pion.type != "L" || board.matrice[toX+1][toY].pion.type != "L")
        	return false;
        
        if(board.matrice[toX][toY-1].pion.type != "L" || board.matrice[toX][toY+1].pion.type != "L")
        	return false;
        */
        return true;
    }
	
    public boolean EstPionEffrayant(Plateau board, int x,int y, int tox, int toy){
    	
    	if (tox < 0 || tox > board.nrow )
    		return true;
    	if (toy < 0 || toy > board.nrow )
    		return true;
    	if(board.matrice[x][y].pion.isPlayer1 != board.matrice[tox][toy].pion.isPlayer1){
    		if(board.matrice[tox][toy].pion.type == "L" || board.matrice[tox][toy].pion.type == "L")
    			return true;
    	}
    	return false;
    }


	public void SeDeplacer (Plateau board, int From_x, int From_y, int to_x, int to_y){
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

