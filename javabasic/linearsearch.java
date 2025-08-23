
import java.util.*;
public class linearsearch{
    public static int LinearSearch(int arr[],int n){
        

        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
               
                return i;
               
            }
        }
        return -1;
    }
    public static int LargeElement(int arr[]){
        int max=Integer.MIN_VALUE;//- infinity smallest value
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            
            }
        }
        return max;
    }
     public static int SmallElement(int arr[]){
        int min=Integer.MAX_VALUE;//+ infinity lagest value
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            
            }
        }
        return min;
    }
    public static void main(String args[])
    {

        int arr[]={6,32,56,32,3,14,67,5,-1,100,10,33,43};
        int key=60;
        int index=LinearSearch(arr,key);
        if(index==-1){
            System.out.println("not found");
        }
           else{
 System.out.println("Element found at "+index+"th index");

        }

        int max=LargeElement(arr);
        System.out.println("Largest element from array is "+max);
        int min=SmallElement(arr);
        System.out.println("smallest element from array is "+min);
       

    }
}