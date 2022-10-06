/*Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).*/
class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
            ans.add(arr[i]);
            }
        }
        return ans;
        
    }
}
