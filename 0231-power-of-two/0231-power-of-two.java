class Solution {
    public boolean isPowerOfTwo(int n) {
        return  n>0 && (n & (n - 1)) == 0;
        //bit manipulation is done bcz,the powers of 2 always have only one  bit set.
         //16= 100000
         //15= 011111 
         //15 & 16 becomes zero
    }
}