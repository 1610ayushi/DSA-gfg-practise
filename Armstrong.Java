/*
For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
*/
class Solution {
    static String armstrongNumber(int n){
        int temp=n;
        int cnt=0;
        int sumofpow=0;
        while(temp!=0){
            temp/=10;
            cnt++;
        }
        temp=n;
        
        while(temp!=0){
            int digit=temp%10;
            sumofpow+= (int)Math.pow(digit, cnt);
            temp/=10;
        }
        if(n==sumofpow)
        return "Yes";
        else return "No";
    }
}
