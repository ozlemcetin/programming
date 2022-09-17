package org.example.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaintJobTest {

    @Test
    void getBucketCount() {

        //should return -1 since the width parameter is invalid
        Assertions.assertEquals(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2), -1);

        /*
        should return 3 since the wall area is 7.14, a single bucket can cover
        an area of 1.5 and Bob has 2 extra buckets home.
         */
        Assertions.assertEquals(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2), 3);

        /*
        should return 3 since the wall area is 8.9375, a single bucket can cover
        an area of 2.5 and Bob has 1 extra bucket at home.
         */
        Assertions.assertEquals(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1), 3);
    }

    @Test
    void testGetBucketCount() {

        //should return -1 since the width parameter is invalid
        Assertions.assertEquals(PaintJob.getBucketCount(-3.4, 2.1, 1.5), -1);

        //should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
        Assertions.assertEquals(PaintJob.getBucketCount(3.4, 2.1, 1.5), 5);

        //should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
        Assertions.assertEquals(PaintJob.getBucketCount(7.25, 4.3, 2.35), 14);
    }

    @Test
    void testGetBucketCount1() {

        //should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
        Assertions.assertEquals(PaintJob.getBucketCount(3.4, 1.5), 3);

        //should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
        Assertions.assertEquals(PaintJob.getBucketCount(6.26, 2.2), 3);

        //should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
        Assertions.assertEquals(PaintJob.getBucketCount(3.26, 0.75), 5);
    }
}