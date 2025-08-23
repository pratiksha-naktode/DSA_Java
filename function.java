import java.util.*;
public class function{
    public static void ChangeA(int a){
        
     a=40;
     System.out.println("A=  "+a);
              }
    
    public static void Swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }

    public static int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        return fact;
    }

    public static int BinomialCoeficient(int n,int r){
        return(Factorial(n)/(Factorial(r)*Factorial(n-r)));
    }
    
    public static int add(int a,int b){
        return(a+b);
    }
    public static int add(int a, int b,int c){
        return(a+b+c);
    }
    public static int add(int a,int b,int c,int d){
        return(a+b+c+d);
    }

    public static boolean IsPrime(int n){
        boolean isprime=true;
       for (int i=2;i<n-1;i++){//for(int i=2;i<Math.sqrt(n);i++)
            if(n%i==0){
                isprime=false;//return false
                break;
            }
        }
        return isprime;//return true
       
    }
    public static  void Prime(int n){
       int count ;
       for(count=1;count<=n;count++){
        if(IsPrime(count)){
            System.out.println(count);
        }
        else{
            continue;
        }
       }
      
    }

public static void BinToDec(int n){
    int num=n;//need to store into another valu for further use beacuse udation made in n
    int pow=0;
    int dec=0;//to store decimal of number 
    int lastdigit;
    while(n>0){
        lastdigit=n%10;//find last digit
        dec=dec+(lastdigit*(int)Math.pow(2,pow));//multiply with 2 base power and add to dec to get final value 2. pow take double type parameter and return double type anser so need to convert into int
        n=n/10;//removing last value
        pow++;//increase the pow value
    }
    System.out.println("Decinaml of "+num+ " is : "+dec);
}

public static void DecToBin(int n){
    int num=n;
    int bin=0, pow=0;
    while(n>0){
        int rem=n%2;
        bin=bin+(rem*(int)Math.pow(10,pow));
        n=n/2;
        pow++;
    }
    System.out.println("Binary OF "+num+" is: "+bin);
}

    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
    BinToDec(1000);
    DecToBin(8);
           }
}