class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            
                if(nums[i]==nums[i-1])
                {
                    count++;
                }
                   
            
        }
        if(count>1)
        {
            return true;
        }
        

        return false;
    }
}