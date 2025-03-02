class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int num=0;
        int y=x;
        
        while(y!=0)
        {
            num = (num * 10) + (y % 10);
            y=y/10;
        }
        return num == x ? true:false;
        
    }
}