package Assignment;
import java.util.ArrayList;
//Q.41: https://leetcode.com/problems/first-missing-positive/description/
    public class FirstMissingPositive {
        public static void main(String[] args) {
            int[] nums = {3,4,-1,1};
            System.out.println(firstMissingPositive(nums));
            System.out.println((int)(Math.log10(1242356478)+1));
        }

        public static int firstMissingPositive(int[] nums) {
            int n = nums.length, i=0;
            ArrayList<Integer> ans = new ArrayList<>();
            while(i < n){
                int correctIndex = nums[i]-1;
                if(correctIndex >=0 && correctIndex<=nums.length-1 && nums[i] != nums[correctIndex]){
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                }else i++;
            }
            for(int j=0; j<n; j++){
                if(nums[j] != j+1) return j+1;
            }
            return n+1;
        }
    }
