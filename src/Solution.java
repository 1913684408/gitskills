class Solution {
    public int removeDuplicates(int[] nums) {
        int sum = nums.length;
        int k[] = new int[sum];
        for(int i = 0 ;i < nums.length;i++){
            for (int j = i + 1;j < nums.length;j++){
                if (nums[i] == nums[j]) {
                    k[i] = nums[i];
                    sum--;
                }
            }
        }
        return sum;
    }
}