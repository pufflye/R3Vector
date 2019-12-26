#R3Vector //Задача на вектор

import java.util.Scanner;

public class R3Vector
{
    private double x, y, z;

    public R3Vector()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите координату x вектора: ");
        x = in.nextDouble();
        System.out.println("Введите координату y вектора: ");
        y = in.nextDouble();
        System.out.println("Введите координату z вектора:");
        z = in.nextDouble();

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void sum(R3Vector f, R3Vector e)
    {
        double sumx = f.x + e.x;
        double sumy = f.y + e.y;
        double sumz = f.z + e.z;

        System.out.println("Сумма векторов: " + "\n 1. " + sumx + ";\n 2. " + sumy + ";\n 3. " + sumz + ".");
    }

    public static void raz(R3Vector f, R3Vector e)
    {
        double razx = f.x - e.x;
        double razy = f.y - e.y;
        double razz = f.z - e.z;

        System.out.println("Разность векторов: " + "\n 1. " + razx + ";\n 2. " + razy + ";\n 3. " + razz + ".");
    }


    public static void scalar(R3Vector f, R3Vector e)
    {
        double a = f.x * e.x;
        double b = f.y * e.y;
        double c = f.z * e.z;

        double scal = a + b + c;

        System.out.println("Скалярное произведение векторов: \n" + scal);
    }

    public static void vsum(R3Vector f, R3Vector e)
    {
        double vsumj = f.x * e.y - f.y * e.x;
        double vsumg = f.y * e.z - f.z * e.y;
        double vsumh = f.z * e.x - f.x * e.z;

        System.out.println("Векторное произведение векторов: \n 1. " + vsumj + ";\n 2. " + vsumg + ";\n 3. " + vsumh + ".");
    }


    public static void sm(R3Vector f, R3Vector e, R3Vector l)
    {
        double g = f.x * e.y * l.z;
        double n = f.y * e.z * l.x;
        double m = f.z * e.x * l.y;
        double v = f.z * e.y * l.x;
        double d = f.y * e.x * l.z;
        double k = f.x * e.z * l.y;

        double r = g + n + m - v - d - k;

        System.out.println("Смешанное произведение векторов равно: \n" + r);
    }

    public static void vch(R3Vector f)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        double h = in.nextDouble();

        double vchx = h * f.x;
        double vchy = h * f.y;
        double vchz = h * f.z;

        System.out.println("Произведение вектора на число: \n 1. " + vchx + ";\n 2. " + vchy + ";\n 3. " + vchz + ".");
    }
}
