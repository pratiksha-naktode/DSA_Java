import java.util.*;
public class Loop_Practice{

    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int num;

     do{
        System.out.println("Enter number");
     int n=sc.nextInt();
     int evennum=0, oddnum=0;

     if(n%2==0){
        evennum+=n;
     }
     else{
        oddnum+=n;
     }

     System.out.println("Do you want to continue if yes 1 if no 0");
      num=sc.nextInt();

     }while(num==1);
        


    }
}