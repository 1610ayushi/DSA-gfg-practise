/*
Given a number N. The task is to complete the function convertFive() which replace all zeros in the number with 5 and returns the number.

Input:
The first line of input contains an integer T, denoting the number of testcases. Then T testcases follow. Each testcase contains a single integer N denoting the number.

Output:
The function will return integer where all zero's are converted to 5.
*/
/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
    String str=Integer.toString(n);
    int num=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0'){
        num=(num*10)+5;
        continue;
    }
    num=(num*10)+(str.charAt(i)-'0');
    }
    return num;
}
}
