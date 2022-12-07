package questions;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] input = {2, 1, 2, 1, 3, 4, 3};
        System.out.println(removeDuplicates(input));
    }

    static public ArrayList<Integer> removeDuplicates(int[] input) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(map.containsKey(input[i])) {
                continue;
            }
            ans.add(input[i]);
            map.put(input[i], true);
        }
        return ans;
    }
}
