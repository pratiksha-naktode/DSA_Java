public class function_practice{
    public static int Avg(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }

    public static boolean ISeven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
public static void IsPalindrom(int n){
    int num=n;
    int rev=0;
    
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
       
    }
    if(num==rev){
        System.out.println("Number is palindrome");
    }
    else{
        System.out.println("Number is not palindrome");
    }
}
    public static void AddDigit(int n){
        int sum=0;
        int num=n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("sum of digit of number "+num+" is "+sum );
    }

    public static void main(String args[]){
        System.out.println(Avg(1,2,3));
        if(ISeven(45)){
            System.out.println("Even num");
        }
        else{
            System.out.println("ODd num");
        }
        IsPalindrom(11111111);
        AddDigit(-12);
    }
}