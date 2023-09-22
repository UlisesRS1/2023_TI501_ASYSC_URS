package tools;

public class Coordenate {

    public static final float XMIN = -20.0f;
    public static final float YMIN = -20.0f;
    public static final float XMAX = 20.0f;
    public static final float YMAX = 20.0f;

    public static final int XSCR = 400;
    public static final int YSCR = 400;

    public static int toScreenX(float x) {
        //return (int) (x * XSCR / XMAX);
        return (int) ((x - XMIN) * XSCR/ (XMAX - XMIN));
    }

    public static int toScreenY(float y) {
        //return (int) ((YMAX - y) * YSCR / YMAX);
        return (int) ((y - YMAX) * YSCR / (YMIN - YMAX));
    }
}
