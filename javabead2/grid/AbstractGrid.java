package grid;
import position.Position;

public abstract class AbstractGrid<E> implements Grid<E> {
    
   public final int rows;
   public final int cols;

    public AbstractGrid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }
   
    public boolean isValid(Position p1){
       if(p1.h>=0 && p1.v>=0){
          if(p1.v<rows && p1.h<cols)
           return true;
          else return false;
       }else
      return false;     
    }
}
