import java.util.*;

public class Loops{
    public static void main(String args[]){

Scanner sc=new Scanner(System.in);
// System.out.println("Enter range");
// int n=sc.nextInt();
// int i=1,sum=0;
// while(i<=n){
// sum+=i;
// i++;
// }
// System.out.println("Sum of "+n+" is :"+sum);

/*or(int i=1;i<=4;i++){
    System.out.println("****");
}

int n=108991,rev=0;

while(n>0){
    int rem=n%10;
     rev=(rev*10)+rem;
    n=n/10;
}
System.out.println("Reverse of "+n+" is: "+rev);*/
// for(int i=0;i<=100;i++){
//     System.out.println("Enter number");
//     n=sc.nextInt();
//     if(n%10==0){
//         break;
//     }
//     System.out.println(n);

// }
/*while(true){
    n=sc.nextInt();
    if(n%10==0){
        break;
    }
    System.out.println(n);
}*/

int n=sc.nextInt();
int i=2;
boolean isprime=true;

while(i<n-1){
if((n%i==0)){

isprime=false;
}
i++;
}


if(isprime==true){
    System.out.println("Number is prime");
}
else{
    
System.out.println("Number is not prime");
}
   }
}