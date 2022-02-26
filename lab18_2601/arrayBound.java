package lab18_2601;

import java.util.Random;
import java.util.Scanner;

public class arrayBound {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr;
        arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
        System.out.print("Array Index : ");
        int in = input.nextInt();
        try {
            System.out.println(arr[in]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

        input.close();
    }
}
