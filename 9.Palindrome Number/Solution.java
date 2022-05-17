class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int r=0,s=0;
        if(x<0)
        {
            return false;
        }
        while(num!=0)
        {
            r=num%10;
            s=(s*10)+r;
            num=num/10;
        }
        if(s==x)
            return true;
        return false;
    }
}