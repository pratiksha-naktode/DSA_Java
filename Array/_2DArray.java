import java.util.*;
public  class _2DArray
{
    public static int Max(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(max<arr[row][col]){
                    max=arr[row][col];
                }
            }
        }
        return  max;
    }
    public static int Min(int arr[][]){
        int min=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(min>arr[row][col]){
                    min=arr[row][col];
                }
            }
        }
        return  min;
    }
    public static void Search(int arr[][],int key){
          boolean flag=false;
           for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(key==arr[row][col]){
                    System.out.println("Element found at position ["+row+","+col+"]");
                    flag=true;
                }
                
        }
       
    }

    if(!flag){
        System.out.println("Element Not found atany position");
    }
    }
    public static void Transpose(int arr[][]){
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                
                System.out.print(arr[col][row]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void SpiralMatrix(int arr[][]){
        int sr=0,sc=0;
        int er=arr.length-1, ec=arr[0].length-1;
        int col,row;
        while (sr<=er&&sc<=ec) { 
            for(col=sr;col<=ec;col++){
                System.err.print(arr[sr][col]+" ");
            }
            for(row=sr+1;row<=er;row++){
                System.err.print(arr[row][ec]+" ");
            }
            for(col=er-1;col>=sc;col--){
                System.err.print(arr[er][col]+" ");
            }
            for(row=er-1;row>=sr;row--){
                System.err.print(arr[row][sc]+" ");
            }
            sc++;
            sr++;
            er--;
            ec--;
        }
    }
    public static void PrintBoundary(int arr[][]){
        int sr=0,sc=0;
        int er=arr.length-1, ec=arr[0].length-1;
        int col,row;
      
            for(col=sr;col<=ec;col++){
                System.err.print(arr[sr][col]+" ");
            }
            for(row=sr+1;row<=er;row++){
                System.err.print(arr[row][ec]+" ");
            }
            for(col=er-1;col>=sc;col--){
                System.err.print(arr[er][col]+" ");
            }
            for(row=er-1;row>=sr; row--){
                System.err.print(arr[row][sc]+" ");
            }
            
    }
    public static void main(String[] args) 
    {
        int row,col;
            int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter array elements");
        for(row=0; row<arr.length;row++){
            for(col=0;col<arr.length;col++){
                
                arr[row][col]=sc.nextInt();
            }
        }

         for(row=0; row<arr.length;row++){
            for(col=0;col<arr.length;col++){
                
                System.out.print(arr[row][col]+" ");
            }
            System.out.println(" ");
        }
        // int res=Max(arr);
        // System.err.println("maximum element "+res);
        //  System.err.println("minimum element "+Min(arr));
        //  Search(arr,-54);
        //  System.err.println("transpose of matrix");
        //  Transpose(arr);
        System.out.println("Spiral Of Matrix");
        SpiralMatrix(arr);
        System.out.println("Boundary Elements only ");
        PrintBoundary(arr);
           }
    
}
            
