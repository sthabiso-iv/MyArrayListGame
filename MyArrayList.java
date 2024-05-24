/**
  *
  * @author (32465092 MSM Dhlamini)
  * @version (1 September 2023)
  */

import java.util.Random;

public class MyArrayList<E> {
    private static final int MAX_LENGTH = 4;
    private int size;
    private E[] data;

  @SuppressWarnings("unchecked")
    public MyArrayList() {
        data = (E[]) new Object[MAX_LENGTH];
        size = 0;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        for (int i = size - 1; i >= index; i--)
            data[i + 1] = data[i];

        data[index] = e;
        size++;
    }

    public int getCount(E card) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (data[i] != null && data[i].equals(card)) {
                count++;
            }
        }
        return count;
    }

    public boolean isAllGuessed() {
        for (int i = 0; i < size; i++) {
            if (!(data[i] instanceof MemoryCard) || !((MemoryCard) data[i]).isGuessed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        return size == MAX_LENGTH;
    }

    public boolean contains(Object e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return true;
        return false;
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return data[index];
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        E e = data[index];
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];
        data[size - 1] = null;
        size--;
        return e;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }
        result.append("]");
        return result.toString();
    }

    public int size() {
        return size;
    }

  @SuppressWarnings("unchecked")
    public boolean sortList() {
        E hold;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (((Comparable) data[j]).compareTo(data[j + 1]) > 0) {
                    hold = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = hold;
                }
            }
        }
        return true;
    }

}
