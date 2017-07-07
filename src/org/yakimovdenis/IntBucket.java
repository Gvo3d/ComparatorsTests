package org.yakimovdenis;

/**
 * Created by Gvozd on 07.07.2017.
 */
public class IntBucket {
    private int data;

    public IntBucket(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "IntBucket{" +
                "data=" + data +
                '}';
    }
}
