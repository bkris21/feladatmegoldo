package position;

public enum Direction {
    UP_LEFT,UP_RIGHT,DOWN_LEFT,DOWN_RIGHT;

    public static Direction fromDistance(int[] x) {
        if(x[0]<0 && x[1]>0)
            return UP_LEFT;
        else
        if(x[0]<0 && x[1]<0)
            return DOWN_LEFT;
        else
        if(x[0]>0 && x[1]>0)
            return UP_RIGHT;
        else
        if(x[0]>0 && x[1]<0)
           return DOWN_RIGHT;
        else
           return null;
    }
}