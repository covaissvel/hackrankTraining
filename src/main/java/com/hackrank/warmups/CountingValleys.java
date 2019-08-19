package com.hackrank.warmups;

import static java.lang.Math.abs;

/**
 * Hello world!
 */
public class CountingValleys {
    public static void main(String[] args) {

        System.out.println(countingValleys(8, "UDDDUDUU"));
    }


    private static int countingValleys(int n, String s) {
        String[] arr = s.split("");

        int count = 0;
        int stepCount = 0;

        for (String current : arr) {
            System.out.println(" current : " + current);
            System.out.println(" count before : " + count);
            if (current.equalsIgnoreCase("U")) {
                count = count+1;
            }
            if (current.equalsIgnoreCase("D") ){
                count = count-1;
            }
            System.out.println(" count after : " + count);

            if (count == 0 && current.equalsIgnoreCase("U") ){
                   stepCount = stepCount+1;
            }
            System.out.println(" stepCount after : " + stepCount);

        }
        return stepCount;


    }
}
