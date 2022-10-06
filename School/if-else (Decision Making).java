/*
Given two integers, n and m. The task is to check the relation between n and m.
*/
class Solution{
    static String compareNM(int n,int m){
        // code here
        if(n<m){
           return "lesser";
            
        }
        else if(n==m){
            return "equal";
        }
        else
        {
            return "greater";
        }
    }
}
