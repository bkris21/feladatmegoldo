package grid;
import position.Position;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;

public class DenseGrid<E> extends AbstractGrid<E> {

    private List<List<E>> grid = new ArrayList<List<E>>();

    public DenseGrid(int rows, int cols) {
        super(rows, cols);
        List<E> tmp = new ArrayList<E>();
        for (int i = 0; i < cols; ++i) {
            tmp.add(null);
        }
        for (int i = 0; i < rows; ++i) {
            this.grid.add(new ArrayList<>(tmp));
        }
        System.out.println(grid);
    }

    @Override
    public E get(Position p) {
        if (isValid(p)) {
            List<E> x = grid.get(p.v);
            return x.get(p.h);
        } else {
            throw new IndexOutOfBoundsException("Invalid Position" + p.h + p.v);
        }
    }

    @Override
    public void set(Position p, E tmp) {
        if (isValid(p)) {
            int x = p.v;
            int y = p.h;
            
            grid.get(x).set(y, tmp);
        } else {
            throw new IndexOutOfBoundsException("Invalid Position" + p.h + p.v);
        }
    }

}
