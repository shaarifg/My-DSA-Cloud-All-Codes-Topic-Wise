package questions;

/*
Given a random integer array A of size N.
Find and print the count of pair of elements in the array which sum up to 0.
Note: Array A can contain duplicate elements as well.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class PairSumToZero {
    public static void main(String[] args) {
        int[] input = {2,2, 1, -2, 2, -1, 3, 4, 3};
        System.out.println(pairSumToZero(input));
    }

    public static int pairSumToZero(int[] input) {
        int pairCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: input){
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }else{
                map.put(x, 1);
            }
        }

//        Set<Integer> keys = map.keySet();
//        System.out.println(keys);
//        System.out.println(keys.size());
        for(Integer pair : map.keySet()){
            if(map.containsKey(-pair) && pair != 0 ){
                pairCount = pairCount+(map.get(pair)*map.get(-pair));
            }
        }
        pairCount = pairCount/2;
        if(map.containsKey(0)){
            int value = map.get(0);
            pairCount += (value * (value-1))/2;
        }
        return pairCount;
    }
}
