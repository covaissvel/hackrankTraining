package com.hackrank.warmups;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class leftRotation {

//    StringBuilder output = new StringBuilder();
//	for(int i = 0; i<n; i++) {
//
//        b[i] = a[(i+k) % n];
//        output = output.append(b[i]).append(" ");
//
//    }

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int count = a.length;
        System.out.println("Count  : "+count);
        int[] tempArr1 = a;
        int[] tempArr2 = new int[count];
        for(int i=0;i<d;i++){
            System.out.println("tempArr1 : \n");
            Arrays.stream(tempArr1).forEach(System.out::println);
            for(int j=0;j<count;j++){
                System.out.println("J = "+j);
                if( j == count-1){
                    tempArr2[j] = tempArr1[0];
                }else{
                    tempArr2[j] = tempArr1[j+1];
                }
            }
            tempArr1 = tempArr2.clone();
            System.out.println("tempArr2 : \n");
            Arrays.stream(tempArr2).forEach(System.out::println);
        }

//        StringBuilder output = new StringBuilder();
//
//        for(int i = 0; i<d; i++) {
//
//            tempArr1[i] = a[(i+k) % n];
//            output = output.append(b[i]).append(" ");
//
//        }
        return tempArr1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
            System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
                System.out.println(" ");
            }
        }

        System.out.println("\n");

        scanner.close();
    }
}
