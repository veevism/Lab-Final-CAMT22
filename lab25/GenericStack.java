
public class GenericStack<E> {
    private final static int INITIAL_SIZE = 10;
    private E[] array;
    private int index = 0;

    public GenericStack() {
        this(INITIAL_SIZE);
    }

    public GenericStack(int size) {
        this.array = (E[]) new Object[size];
    }

    public int getSize() {
        return index;
    }

    public E peek() {
        return array[index - 1];
    }

    public void push(E o) {
        if (index >= array.length) {
            E[] temp = (E[]) new Object[array.length * 2];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[index++] = o;
    }

    public E pop() {
        return array[(index--) - 1];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < index; i++) {
            if (i == index - 1)
                result += array[i].toString();
            else
                result += array[i].toString() + ",";
        }
        return "stack: " + result + "]";
    }
}