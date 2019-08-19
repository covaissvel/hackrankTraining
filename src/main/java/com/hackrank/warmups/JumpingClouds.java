package com.hackrank.warmups;

import java.util.ArrayList;
import java.util.List;

public class JumpingClouds {

    public static void main(String[] args) {
//        int[] c = {0,0,1,0,0,1,0};
        int[] c = {0,1,0,0,0,1,0};
        System.out.println(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {
        int noOfJumps = 0;
        List<Integer> avoidIntegers = new ArrayList<>();

        for(int i=0;i<c.length-1;i++){
            if(c[i] == 1)
                avoidIntegers.add(i);
        }
        int jumpedIndex = 0;
;
        for(int i=0;i<c.length-1;i=jumpedIndex){
            if(!avoidIntegers.contains(i+2)){
              noOfJumps = noOfJumps+1;
                jumpedIndex = i +2;
            }else if(!avoidIntegers.contains(i+1)){
                noOfJumps = noOfJumps+1;
                jumpedIndex = i +1;
            }


        }


        return noOfJumps;

    }


}
