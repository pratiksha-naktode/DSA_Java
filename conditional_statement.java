import java.util.*;

public class conditional_statement{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter age :");
        int age=sc.nextInt();

        if(age<=0){
            System.out.println("Age Cannot Be Negative");
        }
        else if(age>=18){
            System.out.println("You can Drive");
        }
        else{
            System.out.println("You cannot Drive");
        }
         float incometaxamount=((income*18)/100);
       float totalamount=income-incometaxamount;
       System.out.println("imcome tax amount deducted: "+incometaxamount);
        System.out.println("your salary is after paying income tax  is:"+totalamount);

        System.out.println("Enter Your Income :");
       float income=sc.nextFloat();
       float tax;
      
       if(income<500000){
        tax=0;
       }
       else if(income>=5000000 && income<1000000){
        tax=(income*0.2f);
        
       }
       else {
            //  incometaxamount=((income*30)/100);
            tax=(income*0.3f);
      }
       System.out.println("imcome tax amount deducted: "+tax);
        System.out.println("your salary is after paying income tax  is:"+(income+tax));*/

        System.out.println("Enter  three numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
        else if(a<b){
            if(b>c){
                System.out.println(b+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
        else{
            System.out.println("All are equal");
        }

        int number=4;

        String type=((number%2)==0)?"Even":"Odd";
        System.out.println(type);
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        // if(marks>=33){
    //     System.out.println("PASS");
        // }
        // else{
        //     System.out.println("FAIL");
        // }
         type=(marks>=33)?"PASS":"FAIL";
        System.out.println("You are "+type);
     

    }
}