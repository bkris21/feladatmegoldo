package grid;
import position.Position;
import java.util.Map;
import java.util.HashMap;
public class SparseGrid<E> extends AbstractGrid<E> {

    private Map<Position,E> smg;

    public SparseGrid(int rows, int cols) {
        super(rows, cols);
        this.smg = new HashMap<>();
    }

    @Override
    public E get(Position p) {
        if (isValid(p)) {
            return (E) smg.get(p);
        } else {
            throw new IndexOutOfBoundsException("Invalid Position" + p.h + p.v);
        }
    }
 
     
    @Override
    public void set(Position p, E tmp) {
        if (isValid(p)) {
           
            if(tmp==null){
              smg.remove(p);}
            else{
              smg.put(p,tmp);
            }
        } else {
            throw new IndexOutOfBoundsException("Invalid Position" + p.h + p.v);
        }
    }
  
}
