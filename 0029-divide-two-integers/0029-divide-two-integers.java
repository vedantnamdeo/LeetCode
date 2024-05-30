class Solution {
    public int divide(int dividend, int divisor) {
        long quo=(long)dividend/divisor;
        if(quo>Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
        else if(quo<Integer.MIN_VALUE)
        return Integer.MIN_VALUE;

        else
        return (int)quo;
    }
}