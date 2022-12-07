package questions;

import java.util.HashMap;
import java.util.Set;

/*
You are given an array of integers that contain numbers in random order.
Write a program to find and return the number which occurs the maximum times in the given input.

If two or more elements contend for the maximum frequency,
return the element which occurs in the array first.
*/
public class MaximumFreqInArray {
    public static void main(String[] args) {
        int[] input = {1,2, 1, 2, 1, 3, 4, 3,1};
        System.out.println(maxFreqElement(input));
    }

    private static int maxFreqElement(int[] input) {
        int count = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(map.containsKey(input[i])) {
                map.put(input[i], map.get(input[i])+1);
            }
            else {
                map.put(input[i], 1);
            }
        }
        System.out.println(map);
        System.out.println(map.get(1));

        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        int maxFreq = Integer.MIN_VALUE, maxFreqElement = 0;

        for (int x: keys){
            if(map.get(x)>maxFreq) {
                maxFreq = map.get(x);
                maxFreqElement = x;
            }
        }
        System.out.println(map.size());
//        return maxFreq;
        return maxFreqElement;
    }
}
