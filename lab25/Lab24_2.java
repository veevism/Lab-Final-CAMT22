
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lab24_2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();

        for (int i = 0; i <= 9; i++) {
            list.add(rnd.nextInt(20));
        }

        System.out.println("No shuffle: " + list.toString());

        shuffle(list);

        System.out.println("Shuffled: " + list.toString());
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }
}