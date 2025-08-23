import java.util.*;

public class MaximumSumSubArray {

    public static void Demo(int arr[]) 
    {
        //BRUET FORCE
        int sum = 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = i; j < arr.length; j++) {
                 sum=0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println("sum: " + sum);
                if (max < sum) {
                    max = sum;

                }
                }
            
        }
        System.out.println("maximum sum is " +max);
    }

     public static void Prefix_sum(int arr[]) {

        int prefix[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int sum;

        // Step 1: Build prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 2: Check all subarrays using if-else 
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                if (start == 0) {
                    sum = prefix[end];
                } else {
                    sum = prefix[end] - prefix[start - 1];
                }

                if (sum > max) {
                    max = sum;
                }
            }
        }

        // Step 3: Print the result
        System.out.println("Maximum sum is " + max);
    }
    
    public static void Kadane(int arr[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            if(currsum>max){
                max=currsum;
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {1,-4,5,7,8};
        //Demo(arr);
     //   Prefix_sum(arr);
            Kadane(arr);
             System.out.print(Arrays.toString(arr));
    }
}
