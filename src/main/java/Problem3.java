public class Problem3 {

    // Do not change signature (function name, parameters, return type)
    public static long SumOfNonUnique(int[] data) {
        long sum = 0; //sum of non unique entries in array

        for (int i = 0; i < data.length; i++) {
            int repetitions = -1; //-1 because the original entry will be counted later

            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) { //then either this is data[i] or a value equal to it
                    repetitions++; //counts original and repetitions
                }

                if (repetitions >= 1) { //meaning there has been a repetition
                    sum += data[i]; //adding the repeated value to the sum
                    break; //unnecessary to keep checking for other repetitions
                }
            }
        }

        return sum;
    }

    /*
    I think I might try to improve my code by avoiding comparing the values of the array to values previously
    compared or the same entry to itself.
    The change I have made to make my code run faster is to have a break in the loop after we find there's a
    repetition and to limit the amount of checks. The techniques I tried but saw didn't work were to skip the second
    if statement when the first if statement is false. Then I also tried to check that i does not equal j in the first
    check to avoid counting the entry itself for the repetitions and then include the second if statements commands in
    the first if statement.
    My code iterates through the array once for each entry in the array because each value in the array is checked
    against every value in the array and takes about 3.5 seconds.
    As far as code clarity, I don't think there are many improvements I could make. I could change the variable name
    sum to sumOFNonUniqueEntries or something or data to intArray.
    Yes, I think it would be easy to add another test case for my code because all that needs to be done is add the
    array of ints to the inputs array and the expected value to the expects array.
     */
}