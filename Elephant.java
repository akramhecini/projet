package projet;

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
        
      /*  if(board.matrice[toX-1][toY].pion.type != "S" || board.matrice[toX+1][toY].pion.type != "S")
        	return false;
        if(board.matrice[toX][toY-1].pion.type != "S" || board.matrice[toX][toY+1].pion.type != "S")
        	return false;
        if(board.matrice[toX-1][toY-1].pion.type != "S" || board.matrice[toX-1][toY+1].pion.type != "S")
        	return false;
        if(board.matrice[toX+1][toY-1].pion.type != "S" || board.matrice[toX+1][toY+1].pion.type != "S")
        	return false; */
        
        if(EstPionEffrayant(board,fromX,fromY,toX-1,toY)==true || EstPionEffrayant(board,fromX,fromY,toX+1,toY) ==true)
        	return false;
        
        if(EstPionEffrayant(board,fromX,fromY,toX,toY-1)==true|| EstPionEffrayant(board,fromX,fromY,toX,toY+1) == true)
        	return false;

        if(EstPionEffrayant(board,fromX,fromY,toX-1,toY-1)==false || EstPionEffrayant(board,fromX,fromY,toX+1,toY+1) == false)
        	return false;
        if(EstPionEffrayant(board,fromX,fromY,toX+1,toY-1)==false || EstPionEffrayant(board,fromX,fromY,toX-1,toY+1) == false)
        	return false;
        
        
      //verifier que ne passe pas au dessus de pion: 6 cas possible ( 4 digonales, vertic ou horiz) : 
        
        //1 : vert ou horiz : 
        
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
        
        // diag : 
        
        
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
    		if(board.matrice[tox][toy].pion.type == "S" || board.matrice[tox][toy].pion.type == "S")
    			return true;
    	}
    	return false;
    }

	@Override
	public void SeDeplacer(Plateau board, int From_x, int From_y, int to_x, int to_y) {
		// TODO Auto-generated method stub
		
	}
	
	
}