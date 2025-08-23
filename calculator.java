import java.util.*;
public class Calculator{

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

         
   
    do{

int operation;
        System.out.println("Enter Number 1: ");
            int a=sc.nextInt();
        System.out.println("Enter Number 2: ");
            int b=sc.nextInt();
             System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");
            System.out.println("Choose Operation choice:");
             operation=sc.nextInt();
            
        switch(operation){
        case 1:
                  int sum=a+b;
                System.out.println("Sum of number "+a+" and "+b+" is "+sum);
                break;
        
        case 2:
                System.out.println("Subtraction of of number "+a+" and "+b+" is "+(a-b));
                break;
        case 3:
                System.out.println("Multiplication  of number "+a+" and "+b+" is "+(a*b));
                break;
        case 4:
                System.out.println("Division of number "+a+" and "+b+" is "+(a/b));
                break;
        case 5:
                System.out.println("Modulo of number "+a+" and "+b+" is "+(a%b));
                break;
        case 6:
                System.out.println("Exit !!!!!");

        default :
            System.out.println("Invalid choice of operation");
    }
  
    }while(6);


    }
}