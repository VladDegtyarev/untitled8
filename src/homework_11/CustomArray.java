package homework_11;
import java.util.Arrays;

public class CustomArray<Arr> {
    private Object[] elements;
    private int size;


    public CustomArray() {
        elements = new Object[6];
        size = 0;
    }

    public CustomArray(int initialCapacity) {
        elements = new Object[initialCapacity];
        size = 0;
    }

    public void add(Arr element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }
    public void resize() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    public int size() {
        return size;
    }
    public void remove(int index) {
       System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    public Arr get(int index) {
        return (Arr) elements[index];
    }

    public boolean contains(Arr element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }




}