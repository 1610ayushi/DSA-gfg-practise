/*Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
If the user's choice is 1, calculate the area of the circle having the given radius(R).  
Else if choice is 2, calculate the area of the rectangle with given length(L) and breadth(B)*/


class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        double area=0;
        switch(choice){
            case 1:
                area= Math.PI*arr.get(0)*arr.get(0);
                break;
            case 2:
                area= arr.get(0)*arr.get(1);
                break;
        }
        return area;
    }
}
