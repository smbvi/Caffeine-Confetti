class Solution {
    public boolean isPalindrome(int x) {
        int rv=0, n=x;
        while(n!=0){
            int r= n % 10;
            rv = rv*10 + r;
            n= n/10;
        }
        if(rv == x && x>=0 ){
            return true;
        }
        else{
            return false;
        }
    }
}
