public class binarysearch{

    public static int BinarySearch(int arr[],int key)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
              }
              return -1;
    }
    public static void main(String  args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
            int key=10;
            int index=BinarySearch(arr,key);
            if(index==-1){
                System.out.println("Element not found ");
            }
            else{
                    System.out.println("Element found at "+index+ "th position");
            }
            
    }
}