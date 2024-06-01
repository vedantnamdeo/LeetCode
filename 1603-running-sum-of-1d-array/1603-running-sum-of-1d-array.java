class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int count=0;
        int arr[]=new int[nums.length];
        for(int i:nums)
        {
            sum=sum+i;
            arr[count++]=sum;
        }
        return arr;
    }
}