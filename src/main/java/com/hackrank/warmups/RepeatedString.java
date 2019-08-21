package com.hackrank.warmups;

public class RepeatedString {

    public static void main(String[] args) {
        String s  = "a";
        long n = 1000000000000L;

        System.out.println(repeatedString(s,n));
    }

    private static long repeatedString(String s, long n) {
        long length = s.length();
        long repeat = n / length;
        int remainingChar = (int) (n - repeat * length);
        String substring = s.substring(0,remainingChar);
        int occuranceInOneString = 0;
        for(char c:s.toCharArray()){
            if (c == 'a'){
                ++occuranceInOneString;
            }
        }
        long occuranceTillNth = occuranceInOneString * repeat;
        long occuranceInSubSet = 0L;
        for(char c:substring.toCharArray()){
            if (c == 'a'){
                ++occuranceInSubSet;
            }
        }
        return occuranceTillNth+ occuranceInSubSet;
    }

}
