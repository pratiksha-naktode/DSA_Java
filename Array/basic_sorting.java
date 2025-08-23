import java.util.*;
public class basic_sorting{
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void Selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
         int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;        }
    }
    public static void Insertion_Sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while((prev)>=0 && curr<arr[prev]){
                    arr[prev+1]=arr[prev];// here prev is index and curr is value
                    prev--;
                      }
            arr[prev+1]=curr;
        }
    }
    public static void main(String args[]){
        int arr[]={-43,2,34,1,-2,3};
      //  bubble_sort(arr);
    //  Selection_sort(arr);
      Insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));
        
            }
}