class Solution {
    public boolean isPalindrome(int x) {
        int rv=0, n=x;
        while(n > 0){
            int r= n % 10;
            rv = rv*10 + r;
            n= n/10;
        }
        return rv==x;
        }
    }
