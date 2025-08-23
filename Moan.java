import java.util.*;
public class Moan{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length=scan.nextInt();
       int arr[]=new int[length];
       for(int i=0;i<length;i++){
        arr[i]=scan.nextInt();
       }
    for(int i=0;i<length;i++){
        System.out.println(arr[i]);
       }

}
}