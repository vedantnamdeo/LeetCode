class Solution {
    public int lengthOfLastWord(String s) {
        // if(s.indexOf(s.length()).matches(" "))
        // {
        //     s=
        // }
       s=s.trim();
       return ((s.substring(s.lastIndexOf(" ")+1,s.length())).length());
        
    }
}