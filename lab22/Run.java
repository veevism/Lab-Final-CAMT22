import java.util.Scanner;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        System.out.println("Three sides : ");
        double a = (new Scanner(System.in).nextInt());
        double b = (new Scanner(System.in).nextInt());
        double c = (new Scanner(System.in).nextInt());

        System.out.println("Color : ");
        String color = (new Scanner(System.in).next());

        System.out.println("Fill : ");
        boolean filled = (new Scanner(System.in).nextBoolean());

        Triangle tri1 = new Triangle(a, b, c);

        tri1.setColor(color);
        tri1.setFilled(filled);

        System.out.println(tri1.toString());
    }
}