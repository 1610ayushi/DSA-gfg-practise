//Given an integer, check whether it is a palindrome or not.

class Solution
{
    public String is_palindrome(int n)
    {
        
        int num=0,N=n;
        while(N!=0){
            num=(num*10)+N%10;
            N/=10;
        }
        if(n==num){
            return "Yes";
        }
        else {
            return "No";
        }
    }
}
