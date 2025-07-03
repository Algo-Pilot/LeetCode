import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] twoSum = new int[2];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i<nums.length;i++){
            int value1  = nums[i];
            int sum =0;
            index1 = i;
            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    index2 = j;
                    int value2 = nums[j];
                    sum = value1 + value2;
                    if(sum==target){
                        break;
                    }
                }

            }
            if(sum==target){
                break;
            }

        }
        twoSum[0]=index1;
        twoSum[1]=index2;
        return twoSum;
    }
}
