
public class maxprofit{
    public static int MaximumProfit(int arr[]){
               int maxprof=0;
        int left=0, right=arr.length-1;
        while(left<right){
                if(arr[left]>arr[right]){//sell should bigger than buy then only can make profit
                    left++;
                }
                else{
                    int prof=arr[right]-arr[left];
                     right--;
                    if(prof>maxprof){
                        maxprof=prof;
                    }
                   
                }
        }

    return maxprof;
    }
    public static void main(String[] args) {
         int arr[]={7,8,5,3,12,2};
         int res=MaximumProfit(arr);
         System.out.println("maximum profit "+res);
         System.out.println("........");
    }
}