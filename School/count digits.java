//Given a number N. Count the number of digits in N which evenly divides N.
 class Solution{
    static int evenlyDivides(int N){
        int ans=0;
        int nums=N;
        while(nums>0){
            int lastnum=nums%10;
            if(lastnum!=0 && N%lastnum==0){
                ans++;
            }
            nums/=10;
        }
        return ans;
    }
}
