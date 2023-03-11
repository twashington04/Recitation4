import java.util.Scanner;

public class Recitation4 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        double x = scan.nextDouble();

        System.out.println("Enter y: ");
        double y = scan.nextDouble();

        Point p = new Point(x, y);
        Circle circle16 = new Circle(p, 16.0);

        Point q = new Point(14, 22);
        Circle circle40 = new Circle(q, 40.0);

        if (circle16.intersects(circle40)){
            System.out.println("Circles intersect!");
        }
        else {
            System.out.println("Circles do not intersect!");
        }

    }
}
