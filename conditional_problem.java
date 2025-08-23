import java.util.*;

public class conditional_problem{
    public static void main(String args[]){

        Scanner  sc=new Scanner(System.in);
       /* System.out.println("Enter number");
        int n=sc.nextInt();
        if(n>0){
            
            System.out.println("Number is positive");
        }
        else if(n<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is 0");
        }
       
       int day=sc.nextInt();
       switch(day){
        case 1:System.out.println("Monday");
                break;
        case 2:System.out.println("Tuesday");
                break;
        case 3:System.out.println("Wednesday");
                break;
        default:System.out.println("There are only 7 day ");
       }
      double temp=103.5;
      String res=(temp>100)?"You have Fever":"You dont have Fever";
      System.out.println(res);

      int a=63,b=36;
      boolean x=(a<b)? true : false;
      int y =(a>b) ? a: b;
      System.out.println(x+" :"+y);*/
        System.out.println("Enter year");
      int year=sc.nextInt();

      if((year%400)==0 |&&(year%100)!=0){
        System.out.println("Leap Year");
      }
      else{
        System.out.println("Not a Leap Year");
      }

    }
}