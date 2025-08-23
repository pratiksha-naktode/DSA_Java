public class ArrayPair{
    public static void ArrayPair2(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println(" ");
        }
        System.out.println("total pairs in array"+count);
    }

// find Sum of Pair equal to target and return that pairs
public static void PairSum(int arr[],int target){//BRUET FORCE METHOD O(N)^3
    boolean found=false;
    int sum=0;
    for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            sum=arr[i];
            sum+=arr[j];
            if(sum==target){ //(arr[i]+arr[j])
                found=true;
                System.out.println("["+arr[i]+" ,"+arr[j]+"]");
            }
            sum=0;
        }
      
    }
    if(!found){
        System.out.println("Not Found");
    }
}

public static void SumPair(int arr[],int target){
    int start=0;
    int count=0;
    int end=arr.length-1;
    while(start<end){
        int sum=arr[start]+arr[end];
        if(sum>target)
        {
            end--;
        }
        else  if(sum<target)
        {
            start++;
        }
        else{
            count++;
            System.out.println("["+arr[start]+","+arr[end]+" ]");
        start++;
        end--;
        }
    }
    System.out.println(count+"pairs exist with targeted sum");
}
    
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60};
        ArrayPair2(arr);
       PairSum(arr, 60);
        SumPair(arr, 60);
        
    }
}