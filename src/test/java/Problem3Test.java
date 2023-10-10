/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test {

    // Okay to change the content of this function
    // DO NOT REMOVE OR CHANGE the signature
    @Test
    public void testSumOfNonUnique() {

        int[][] inputs = {
                {3},
                {3, 2},
                {2, 3, 2},
                {2, 4, 2, 1, 4, -5, 4},
                {1, 1, 1, 1},
        };
        long[] expects = {0, 0, 4, 16, 4};

        assertTrue(expects.length == inputs.length);
        //checks that there are the same amount of inputs and expects

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(Problem3.SumOfNonUnique(inputs[i]), expects[i]);
        }
        //checks each sum is equal to expected sum
    }

    @Test
    public void largeArrayTest() {
        final int aLargeNumber = 100000;
        int[] input = new int[aLargeNumber];

        for (int i = 0; i < input.length; i++) {
            input[i] = i - aLargeNumber / 2;    // does this array have any non-unique number in it? No
        }

        final int expect = 0;   // why 0? Because there are no non-unique numbers, so their sum is 0

        long startTime = System.nanoTime();

        long actual = Problem3.SumOfNonUnique(input);

        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;

        assertEquals(expect, actual);

        System.out.printf("time: %f seconds", (double) durationInNano / 1e9);

        // this test takes a bit of time to finish, ain't it?
        // try a better design in your code so this test finishes faster
        // how many seconds did your code improve between the first version and last version of your code?
        // I tried a couple of different ways to speed up my code, but it made it slower. My best is about 3.5 seconds
    }
}