package org.yakimovdenis;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	IntBucket bucket1 = new IntBucket(1);
	IntBucket bucket2 = new IntBucket(2);
	IntBucket bucket3 = new IntBucket(3);
	IntBucket bucket4 = new IntBucket(4);
	IntBucket bucket5 = new IntBucket(5);
	IntBucket bucket6 = new IntBucket(6);
	IntBucket bucket7 = new IntBucket(7);
	IntBucket bucket8 = new IntBucket(8);
	IntBucket bucket9 = new IntBucket(9);
	IntBucket bucket10 = new IntBucket(10);

//        TreeSet<IntBucket> set = new TreeSet(new IntBucketComparator());
        TreeSet<IntBucket> set = new TreeSet(new RIntBucketComparator());

        set.add(bucket5);
        set.add(bucket2);
        set.add(bucket8);
        set.add(bucket1);
        set.add(bucket6);
        set.add(bucket10);
        set.add(bucket3);
        set.add(bucket9);
        set.add(bucket7);
        set.add(bucket4);

        for (IntBucket bucket: set){
            System.out.println(bucket);
        }

    }
}
