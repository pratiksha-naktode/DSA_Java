import java.util.*;
public  class Factorial{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        // int fact=1;
        // if(n<0){
        //     System.out.println("Enter positive number");
        // }
        // else{
        // for(int i=n;i>0;i--){
        //    fact=fact*i; 
        // }
        // System.out.println("Factorial of number is "+fact);
        // }
        
        System.out.println("Enter a number ");

        n=sc.nextInt();
        int ans;
        System.out.println("Table of "+n);
        for(int i=1;i<=10;i++){
            ans=n*i;
            System.out.println(n+" * "+ i+" = "+ans);
        }


   for(int j = 0; j <= 5; j++ ) { 
        System.out.println("j = " + j ); 
        } 
    }
}