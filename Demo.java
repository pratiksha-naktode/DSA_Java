import java.util.*;
public class Demo{

    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int num;
         int evennum=0, oddnum=0;

     do{
        System.out.println("Enter number");
     int n=sc.nextInt();
       if(n%2==0){
        evennum+=n;
     }
     else{
        oddnum+=n;
     }

     System.out.println("Do you want to continue if yes 1 if no 0");
      num=sc.nextInt();

     }while(num==1);

     System.out.println("Sum of odd numers is"+oddnum);
     System.out.println("Sum of odd numers is"+evennum);
        


    }
}