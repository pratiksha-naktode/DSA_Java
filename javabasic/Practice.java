import java.util.*;

public class Practice{
    public static int Max(int arr[]){
        int max=Integer.MIN_VALUE;
        int prev=0;
        for(int i=0;i<arr.length;i++){
          prev=max;
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return prev;
    }
    public static void main(String args[]){
        int arr[]={4,5,7,6};
        System.out.println(Max(arr));
         System.out.println(Max(arr));
    }
}