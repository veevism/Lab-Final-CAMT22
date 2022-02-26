import java.util.ArrayList;

public class sortArrayNum {
    public static void main(String[] args) {
        ArrayList<Number> numlist = new ArrayList<Number>();

        System.out.println(numlist);

        int n = numlist.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (int()numlist. > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }
}
