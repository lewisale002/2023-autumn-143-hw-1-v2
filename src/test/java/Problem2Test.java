import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertTrue;

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                {3, 2, 1},
                {4, 2, 8, 6},
                {5, 5, 5},
                {-4, 5, 3, 7, 432, 54},
                {-4, -432, -65, -6543, -4, -3, 0},
                {3, 4, 5}
        };
        int[][] expects = {
                {1, 2, 3},
                {2, 4, 6, 8},
                {5, 5, 5},
                {-4, 3, 5, 7, 54, 432},
                {-6543, -432, -65, -4, -4, -3, 0},
                {3, 4, 5}
        };

        assertTrue(expects.length == inputs.length);
        //checks that there are the same amount of inputs and expects

        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);

            for (int j = 0; j < inputs[i].length; j++) {

                // this checks whether the actual result matches the expects result
                // note the use of assertArrayEquals instead of assertEquals here
                // less code == less chance of mistake
                assertArrayEquals(expects[i], inputs[i]);
            }
        }
    }
}
