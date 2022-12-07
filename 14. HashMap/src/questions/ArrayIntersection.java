package questions;

import java.util.HashMap;

/*
You have been given two integer arrays/lists (ARR1 and ARR2) of size N and M, respectively.
You need to print their intersection;
An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it
in other words,
when there is a common value that exists in both the arrays/lists.
*/
public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2, 1, 2, 1, 3, 4, 3,1};
        int[] arr2 = {3, 3,1};
       printTwoArraysIntersections(arr1, arr2);
    }

    private static void printTwoArraysIntersections(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x:arr1){
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }else{
                map.put(x, 1);
            }
        }
        for(int x: arr2){
            if(map.containsKey(x)){
                if(map.get(x)>0){
                    System.out.print(x+" ");
                    map.put(x, map.get(x)-1);
                }
            }
        }
    }
}
