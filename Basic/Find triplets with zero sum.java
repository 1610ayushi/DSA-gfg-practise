/*
Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 

Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.
*/
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        
        int x=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int y=x-arr[i];
            int low=i+1;
            int high=n-1;
            while(low<high){
                if(arr[low]+arr[high]==y){
                    return true;
                }
                else if(arr[low]+arr[high]>y){
                    high--;
                }
                else if(arr[low]+arr[high]<y){
                    low++;
                }
            }
        }
        
        return false;
    }
}
