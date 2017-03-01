package position;
import java.util.Formatter;

public class Position {

    public final int h;
    public final int v;

    public Position(int h, int v) {
        this.h = h;
        this.v = v;
    }

       @Override
    public String toString() {
        return String.format("(%d,%d)", h,v);//"(" + h + "," + v + ")";
    }

    public Position next(Direction other) {
        if (other == Direction.DOWN_RIGHT) {
            Position x = new Position(h + 1, v - 1);
            return x;
        } else if (other == Direction.DOWN_LEFT) {
            Position x = new Position(h - 1, v - 1);
            return x;
        } else if (other == Direction.UP_LEFT) {
            Position x = new Position(h - 1, v + 1);
            return x;
        } else if (other == Direction.UP_RIGHT) {
            Position x = new Position(h + 1, v + 1);
            return x;
        } else {
            return null;
        }

    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        Position that = (Position) other;
        return this.v == that.v && this.h == that.h;
    }

    public int[] distance(Position other) {
        int[] x = new int[2];
        x[0] = other.h - h;
        x[1] = other.v - v;
        return x;
    }

    public static boolean isDiagonal(Position p1, Position p2) {
        int[] x = p1.distance(p2);
        if (x[0] == x[1]) {
            return true;
        } else if (x[0] + x[1] == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 100 * v + h;
    }
}
