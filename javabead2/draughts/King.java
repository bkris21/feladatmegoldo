package draughts;

import static draughts.Piece.Color.BLACK;
import static draughts.Piece.Color.WHITE;
import grid.Grid;
import position.Direction;
import static position.Direction.DOWN_LEFT;
import static position.Direction.DOWN_RIGHT;
import static position.Direction.UP_LEFT;
import static position.Direction.UP_RIGHT;
import position.Position;

public class King extends Piece{

    public King(Position p, Color c, Grid<Piece> piece) {
        super(p, c, piece);
    }

    @Override
     public boolean canStepTo(Position p1) {
    boolean ok = false;
        

        if (piece.isValid(p1)) {
            if (p.isDiagonal(p, p1) && !(p.equals(p1))) {
                int[] x = p.distance(p1);
                Direction k = Direction.fromDistance(x);
                Piece neighborough = piece.get(p.next(k));           
                boolean against=false;
                if(neighborough != null){
                   if(neighborough.c != this.c){
                       against=true;
                   }
                }
                boolean empty = (piece.get(p1)== null);
                if (empty) {
                     if (Math.abs(x[0])+ Math.abs( x[1]) == 2) {
                        ok = true;
                    }else 
                      if (Math.abs(x[0]) + Math.abs( x[1]) == 4) {
                        if (against) {
                         ok = true;
                        }
                    }
                }
            }
        }
    return ok ;
}


   String str=c.toString();
     @Override
     public String toString(){
     return str.charAt(0) + "K";  
   }
    
}
