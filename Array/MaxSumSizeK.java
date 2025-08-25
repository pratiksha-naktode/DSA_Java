
//Maximum sum subarray of size k - calculate maximum sum from k size subarray .subarray is contiguos

public class MaxSumSizeK{

    public static void main(String[] args) {
        int arr[]={1,3,7,2,11,13};
        int k=3;
        int maxsum=0;
        for(int i=0;i<k;i++){
            maxsum+=arr[i];
        }
        int currentsum=maxsum;

        for(int i=k;i<arr.length;i++){
            currentsum=currentsum-arr[i-k]+arr[i];
            if(maxsum<currentsum){
                maxsum=currentsum;
            }
        }

        System.out.println(maxsum);
       //  System.out.println(maxsum);

    }
}