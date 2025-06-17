class Solution {
    private static int mod = 1000000007;
    public int countGoodNumbers(long n) {
        long evenpositions = (n+1)/2;
        long oddpositions = (n/2);

        long even = modpow(5,evenpositions,mod);
        long odd = modpow(4,oddpositions,mod);

        return (int)((even *odd)%mod);
        
    }
    private long modpow(long base , long exp , long mod){
        long res=1;
        base%=mod;

        while(exp>0){
            if(exp%2!=0){
                res = (res * base )% mod;
            }
            base = (base*base) % mod;
            exp =exp/2;
        }
        return res;
    }
}