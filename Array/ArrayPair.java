public class ArrayPair{
    public static void ArrayPair(int arr[]){
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

    
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        ArrayPair(arr);
        
    }
}