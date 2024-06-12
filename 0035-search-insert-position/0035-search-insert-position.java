class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int temp[]=new int[nums.length+1];
        List<Integer> l=new ArrayList<>();
        for(int i:nums)
        {
            l.add(i);
        }
        if(l.contains(target))
        return l.indexOf(target);
        else
        {
             for (int i = 0; i < nums.length; i++) 
             {
                temp[i] = nums[i];
             }
            temp[temp.length-1]=target;
            // for(int i:temp)
            // System.out.print(i+" ");
            Arrays.sort(temp);
            // for(int i:temp)
            // System.out.print(i+" ");
            for(int i=0;i<temp.length;i++)
            {
                if(temp[i]==target)
                return i;
            }
        }
        return 0;
    }
}