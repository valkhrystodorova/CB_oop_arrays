package myMethods;

import java.util.Arrays;

public class MyList {
    private Integer[] array = new Integer[10];
    private int size; // by default 0

    public void add(int element) {
        if (size == array.length) {
            extendList();
        }
        array[size] = element;
        size++;
    }

    private void extendList() {
        Integer[] newArr = new Integer[size * 3 / 2 + 1];
        System.arraycopy(array, 0, newArr, 0, size);
        this.array = newArr;
    }

    public void add(int index, int element) {
        Integer[] newArray = new Integer[size + 1];
        if (index < size) {
            if (size == array.length) {
                extendList();
            }
            System.arraycopy(array, index, newArray, index + 1, size - index);
            this.array = newArray;
            array[index] = element;
        }
    }

    public void remove(int index) {
        array[index] = null;
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
