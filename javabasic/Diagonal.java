public class Diagonal{
    public static void main(String args[]){

        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int i=0;i<matrix.length;i++){
                  for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
                 }
            System.out.println("");
                     

        }

        // int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println("Addition of primary diagonal is "+sum);

        // int row=0,col=matrix.length-1;
        // int sum1=0;
        // while(row<=matrix.length-1 && col>=0){
        //     System.out.print(matrix[row][col]+" ");
        //    sum1+=matrix[row][col];
        //     row++;
        //     col--;
        // }
        // System.out.print("Sum of diagonal elements is "+sum1);
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];

            if(i!=matrix.length-1){
                sum+=matrix[i][matrix.length-1];
            }
        }
        System.out.println("Sum of diagonals are "+sum);
    }
}