class Solution {
    public boolean isPalindrome(int x) {
        // int rev=0;int temp=x,rem;
        // while(x!=0)
        // {
        //     rem=x%10;
        //     rev=rev*10+rem;
        //     x=x/10;
        // }
        // System.out.println(rev);
        String s=String.valueOf(x);
        // System.out.println(s);
       StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String s1=new String(sb);
        if(s1.matches(s))
            return true;
        else
            return false;
    }
}