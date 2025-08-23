public class Pattern
{

    public static  void main(String args[])
    {
        // int n=5;

        //     for(int i=1;i<=5;i++)
        //     {
        //         for(int s=1;s<=n-i;s++){
        //             System.out.print(" ");
        //         }
                            
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println("");
        //     }
      
            /* for(int i=1;i<=n;i++)
            {
                for(int s=1;s<=n;s++){
                   if(i==1||i==n||s==1||s==n){
                    System.out.print("*");
                   }
                   else{
                    System.out.print(" ");
                   }
                }
                System.out.println("");
            }

             for(int i=1;i<=n;i++)
            {
                for(int s=1;s<=n-i+1;s++){
                   System.out.print(s+" ");
                   
                                   }
                System.out.println("");
            }
 for(int i=1;i<=n;i++)
            {
                for(int s=1;s<=n-i+1;s++){
                   System.out.print(s+" ");
                   
                                   }
                System.out.println("");
            }
           
           for(int i=1;i<=n;i++)
            {
                for(int s=1;s<=i;s++){
                   System.out.print((s+1)+" ");
                   
                                   }
                System.out.println("");
            }
int c=1;
            for(int i=1;i<=n;i++)
            {
                for(int s=1;s<=i;s++){
                   System.out.print(c+" ");
                   c++;
                   
                                   }
                System.out.println("");
            }*/

        //    for(int i=1;i<=n;i++){

        //         //star
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         //space()
        //          for(int j=1;j<=2*(n-i);j++){
        //             System.out.print(" ");
        //         }
        //         //star
        //          for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println("");
        //    }
        //    for(int i=n;i>=1;i--){

        //         //star
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         //space()
        //          for(int j=1;j<=2*(n-i);j++){
        //             System.out.print(" ");
        //         }
        //         //star
        //          for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println("");
        //    }

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=(n-i);j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=n;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println("");
            // }
            // int j;

            // for(int i=1;i<=n;i++)
            // {
            //    for( j=1;j<=(n-i);j++)
            //    {
            //         System.out.print(" ");
            //     } 

            //     for(j=1;j<=n;j++)
            //     {
            //          if(i==1||i==5||j==1||j==5)
            //          {
                   
            //                  System.out.print("*");
            //             }
            //             else{
            //                 System.out.print(" ");
            //             }
            //     } 
                               
            //     System.out.println("");
            // }
int i;

int n=5;

            for( i=1;i<=n;i++)
            {
               
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++)
                {
                    System.out.print("*");
                }
                                  
                System.out.println("");
            }

             for( i=n;i>=1;i--)
            {
                
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i)-1;j++)
                {
                    System.out.print("*");
                }
                 
                System.out.println("");
            }

            // for( i=n;i>=1;i++)
            // {
            //     for(int j=1;j<=(n-i);j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1;j<=(2*i)-1;j++)
            //     {
            //         System.out.print("*");
            //     }
                    
            //     System.out.println("");
            // }
            
    }


    
}