public class NegativeNum{
    public static void main(String args[]){
        int arr[]={-1,2,-11,0,3,-1,-1,3,-8,8,-9};
        int k=3;
        int start=0;
        int end=k-1;
        while(start<end &&start<=arr.length-k){
            if(arr[start]<0){
                System.out.print(arr[start]+" ");
            }
            start++;
            end++;
        }
    }
}