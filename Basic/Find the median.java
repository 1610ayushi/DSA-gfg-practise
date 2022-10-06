//Calculate the median
class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int n=v.length;
        if(n%2!=0){
            return v[n/2];
        }
        return (v[n/2]+v[(n/2)-1])/2;
    }
}
