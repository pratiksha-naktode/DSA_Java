public class NegativeNum{
    public static void main(String args[]){
        int arr[]={-8,7,4,-4,3,8,-1,5,7,-2,7,3};
        for (int i = 0; i < 10; i++) {
            if(i%3==0){
                if(arr[i]<0){
                    System.out.print(arr[i]+" ");
                }
            }
            
        }
    }
}