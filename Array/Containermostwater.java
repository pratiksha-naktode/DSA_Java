
public class Containermostwater{
    public static int BruetForce(int arr[]){
    
    int maxwater=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int width=j-i;
            int min_height=0;
                if(arr[i]<arr[j]){
                    min_height=arr[i];
                }
                else{
                    min_height=arr[j];
                }
            int currentarea=width*min_height;
            if(maxwater<currentarea){
                maxwater=currentarea;
            }
        }
    }
    return maxwater;
    }


    public static int PoniterMethod(int arr[]){
        int left=0 , maxwater=0 ;
        int right=arr.length-1;

        while(left<right){
          int  width=right-left;
                int min_height=0;
                if(arr[left]<arr[right]){
                    min_height=arr[left];
                }
                else{
                    min_height=arr[right];
                }
            int currentarea=width*min_height;
             if(maxwater<currentarea){
                maxwater=currentarea;
            }
            if(arr[left]<arr[right])
            {
                left++;
            }
            else{
                right--;
            }

        }
        return maxwater;
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7,9};
        // int result=BruetForce(arr);
        int result=PoniterMethod(arr);
        System.out.println("max water "+result);
    }
}