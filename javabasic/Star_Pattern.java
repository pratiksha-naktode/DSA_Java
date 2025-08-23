import java.util.*;

public class Star_Pattern{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char c='A';
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(c);
            c++;
             
        }
        System.out.println(" ");
    }
System.out.println("-----------");
    // for(int l=1;l<=4;l++){
    //     for(int s=1;s<=4-l+1;s++){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }
     for(int l=1;l<=4;l++){
        for(int s=1;s<=l;s++){
            System.out.print(s);
        }
        System.out.println("");
    }
        
    }
}