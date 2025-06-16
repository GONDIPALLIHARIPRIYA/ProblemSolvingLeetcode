class Solution {
    public void reverseString(char[] s) {

        recursionswap(s,0,s.length-1);
        
    }

    void recursionswap(char[] s, int left , int right){
        if(left>=right){
            return;
        }

        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        recursionswap(s,left+1,right-1);

    }
}