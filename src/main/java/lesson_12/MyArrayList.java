package lesson_12;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 1;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(int initialCapacity) {
        this.elements = new Object[initialCapacity];
        this.size = 0;
    }

    public MyArrayList(Object... initialData) {
        this.elements = initialData;
        this.size = initialData.length;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    public void remove(int index) {
        checkIndex(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    public boolean contains(T element) {
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

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = Math.max(1, elements.length * 2);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}

