package com.hackrank.warmups;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class hourglass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(hourglassSum(arr));

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();

    }

    static int hourglassSum(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        for(int r=0;r<4;r++){
            for(int n=0;n<4;n++){
                int count = 0;
                System.out.println("____________________________");
                for(int c=n;c<n+3;c++){
                    count = count + arr[r][c];
                    System.out.print(arr[r][c] + "\t");
                }
                System.out.println("\n");
                count = count + arr[r+1][n+1];
                System.out.println("\t"+arr[r+1][n+1]);
                System.out.println("\n");
                for(int c=n;c<n+3;c++){
                    count = count + arr[r+2][c];
                    System.out.print(arr[r+2][c]+"\t");
                }
                System.out.println("\n");
                System.out.println("count : "+count);
                list.add(count);
            }

        }
        int max = 0;
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        return list.get(0);


    }
}
