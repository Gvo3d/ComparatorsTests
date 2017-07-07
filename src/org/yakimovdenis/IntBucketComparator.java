package org.yakimovdenis;

import java.util.Comparator;

/**
 * Created by Gvozd on 07.07.2017.
 */
public class IntBucketComparator implements Comparator<IntBucket> {
    @Override
    public int compare(IntBucket o1, IntBucket o2) {
        return o1.getData() - o2.getData();
    }
}
