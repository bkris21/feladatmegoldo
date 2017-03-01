package grid;
import position.Position;

public interface Grid<E> {
    
    public boolean isValid(Position p1);
    public E get(Position p);
    public void set(Position p, E tmp);
}
