package com.pb.gershgorin.hw10;

public class NumBox <T extends Number>{

    private final T[] numBoxes;
    private int size;

    public NumBox(int maxSize) {
        this.size = 0;
        this.numBoxes = (T[]) new Number[maxSize];
    }

    public void add(T num) {
        if (size >= numBoxes.length) {
            throw new IndexOutOfBoundsException("Does not exist: " + numBoxes.length);
        }
        numBoxes[size++] = num;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Does not exist: " + index);
        }
        return numBoxes[index];
    }

    public int length() {
        return size;
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < size; ++i) {
            sum += numBoxes[i].doubleValue();
        }
        return sum;
    }

     public T max() {
        double max = Double.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < size; ++i) {
            if (max < numBoxes[i].doubleValue()) {
                max = numBoxes[i].doubleValue();
                maxIndex = i;
            }
        }
        return numBoxes[maxIndex];
    }
    public double average() {
        return sum() / size;
    }
}
