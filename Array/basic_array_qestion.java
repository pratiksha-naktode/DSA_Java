import java.util.*;

public class basic_array_qestion{
    public static int Max_Value(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max <arr[i]){
                max=arr[i];
            }
          
        }
        return max;
    }
     public static int Min_Value(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
          
        }
        return min;
    }
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int Avg(int arr[]){
        int sum=0, avg=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            avg=sum/arr.length;

        }
        return avg;
    }
    public static void Reverse(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
   public static int[] Copy_Array(int arr[]){
    int new_array[] = new int[arr.length];
    for(int i=0; i<arr.length; i++){
        new_array[i] = arr[i];
    }
    return new_array;
}

public static int Second_small(int arr[]){
    int min=Integer.MAX_VALUE;
    int second_small=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];
        }
        if(second_small > arr[i] && arr[i]!=min){
            second_small=arr[i];
        }
    }
    return second_small;
}
public static int Second_largest(int arr[]){
    int max=Integer.MIN_VALUE;
    int second_large=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            second_large=max;
            max=arr[i];
        }
        if(second_large < arr[i] && arr[i]!=max){
            second_large=arr[i];
        }
    }
    return second_large;
}

   public static void main(String args[]){
        int Arr[]={10,20,30,50};
        int result=Max_Value(Arr);
        // System.out.println("Maximum value "+result);
        // System.out.println("Minimum Value "+(Min_Value(Arr)));
        // System.out.println("sum of array value "+(sum(Arr)));
        //  System.out.println("Average of array value "+(Avg(Arr)));
        //  System.out.println("reverse of array");
        //  Reverse(Arr);
        //  Reverse_Array(Arr);
        //  //System.out.println(Arrays.toString(Arr)); 
        //  for(int i=0;i<Arr.length;i++){
        //     System.out.print(Arr[i]+" ");
        //  }
       int copied[] = Copy_Array(Arr);

        System.out.println(Arrays.toString(copied));
        int res=Second_small(Arr);
        System.out.println("Second smallest element "+res);
        System.out.println("Second largest element "+Second_largest(Arr));
          
    }
}