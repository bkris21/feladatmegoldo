package draughts;

import grid.Grid;
import position.Direction;
import static position.Direction.UP_LEFT;
import position.Position;

public abstract class Piece {

    public enum Color {
        WHITE, BLACK
    };
	
    protected Position p;
    protected final Color c;
    protected final Grid<Piece> piece;

    public Piece(Position p, Color c, Grid<Piece> piece) {
        this.p = p;
        this.c = c;
        this.piece = piece;
    }

    public abstract boolean canStepTo(Position p1);

    public void stepTo(Position p1) throws InvalidStepException {
         
        if (canStepTo(p1)) {
            int[] x = p.distance(p1);
            Direction k = Direction.fromDistance(x);
            Position p2 = p.next(k);
             if(!(p1.equals(p2))){
               piece.set(p2, null);
               piece.set(p, null);     
               piece.set(p1,this);
               this.p=p1;
             }else{ 
               piece.set(p, null);     
               piece.set(p1,this);
               this.p=p1;
                     }
        } else {
            throw new InvalidStepException(p, p1);
        }
    }

    @Override
    public abstract String toString();
}
