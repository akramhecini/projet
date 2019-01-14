package projet;

public class Lion extends Pawn {

	public Lion (int x, int y, String type, boolean player1){
		super(x, y, type, player1);
	}
	
	
    public boolean MovementLegal(Plateau board, int fromX, int fromY, int toX, int toY){
    	
    	// le pion bouge t il ou pas 
        if(toX == fromX && toY == fromY)
            return false; 
        
        // on est inboard ou pas? 
        if ((inBoard(board, fromX, fromY) == false) || (inBoard(board, toX, toY) == false))
            return false;
        
        //deplacement non diagonal
        if (Math.abs(toX-fromX) != Math.abs(toY-fromY)) 
        	return false; 
        
        
        
        //verifier que pas out of bound, ni effrayé par pion ennemi
        // on vérifie qu'il s'agit d'un pion adversaire et puis on vérifie s'il le pion correspondant 
        // est effrayant ou pas 
        
        if(EstPionEffrayant(board,fromX,fromY,toX-1,toY)==true || EstPionEffrayant(board,fromX,fromY,toX+1,toY) ==true)
        	return false;
        
        if(EstPionEffrayant(board,fromX,fromY,toX,toY-1)==true|| EstPionEffrayant(board,fromX,fromY,toX,toY+1) == true)
        	return false;

        if(EstPionEffrayant(board,fromX,fromY,toX-1,toY-1)==false || EstPionEffrayant(board,fromX,fromY,toX+1,toY+1) == false)
        	return false;
        if(EstPionEffrayant(board,fromX,fromY,toX+1,toY-1)==false || EstPionEffrayant(board,fromX,fromY,toX-1,toY+1) == false)
        	return false;
        
        
      /*  if(board.matrice[toX-1][toY].pion.type != "E" || board.matrice[toX+1][toY].pion.type != "E")
        	return false;
        if(board.matrice[toX][toY-1].pion.type != "E" || board.matrice[toX][toY+1].pion.type != "E")
        	return false;
        if(board.matrice[toX-1][toY-1].pion.type != "E" || board.matrice[toX-1][toY+1].pion.type != "E")
        	return false;
        if(board.matrice[toX+1][toY-1].pion.type != "E" || board.matrice[toX+1][toY+1].pion.type != "E")
        	return false;
        */
                
        // il doit pas passer au dessus des pions : 4 cas possibles (4 directions)
        
        int ecart = Math.abs(toX - fromX);
        
        if(toX > fromX && toY > fromY){
        	for(int i = 0;i<ecart;i++){
        		if(board.matrice[fromX+i][fromY+i].pion == null)
        			return false;
        	}
        	
        }
        else {
            if(toX < fromX && toY < fromY){

            	for(int i = 0;i<ecart;i++){
            		if(board.matrice[fromX-i][fromY-i].pion == null)
            			return false;
            	}
            	
            }
            
            else{
                if(toX < fromX && toY > fromY){
                	for(int i = 0;i<ecart;i++){
                		if(board.matrice[fromX-i][fromY+i].pion == null)
                			return false;
                	}
                	
                }
                else{

                	for(int i = 0;i<ecart;i++){
                		if(board.matrice[fromX+i][fromY-i].pion == null)
                			return false;
                }
            }
        }}

        
        
        return true;
    }
    

    public boolean EstPionEffrayant(Plateau board, int x,int y, int tox, int toy){
    	
    	if (tox < 0 || tox > board.nrow )
    		return true;
    	if (toy < 0 || toy > board.nrow )
    		return true;
    	if(board.matrice[x][y].pion.isPlayer1 != board.matrice[tox][toy].pion.isPlayer1){
    		if(board.matrice[tox][toy].pion.type == "E" || board.matrice[tox][toy].pion.type == "E")
    			return true;
    	}
    	return false;
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
