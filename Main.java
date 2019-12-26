# R3Vector //задача на вектор
    
public class Main
{
    public static void main(String[] args)
    {
        R3Vector f = new R3Vector();
        R3Vector e = new R3Vector();
        R3Vector l = new R3Vector();

        R3Vector.sum(f, e);
        R3Vector.raz(f, e);
        R3Vector.scalar(f, e);
        R3Vector.vsum(f, e);
        R3Vector.sm(f, e, l);
        R3Vector.vch(f);
    }
}
