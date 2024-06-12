class Solution {
    public int[] searchRange(int[] nums, int target) {
       List<Integer> l=new ArrayList<>();
       int arr[]=new int[2];
       for(int i:nums)
       {
        l.add(i);
       }

        if(l.contains(target))
        {
           arr[0]= l.indexOf(target);
           arr[1]=l.lastIndexOf(target);
           
        }
        else{
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        return arr;
    }
}