public class SpiralMat{

// public static void Print(int mat[][]){
//     for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println("");
//         }
// }
    
    public static void main(String args[]){
        int matrix[][]={{1,2,3,3},{4,5,6,1},{7,8,9,3},{2,3,4,7}};
        int startrow=0,startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow&& startcol<=endcol){

            //top
            for(int col=startcol;col<=endcol;col++){
                System.out.print(matrix[startrow][col]+" ");
                    }
            
            //right
            for(int row=startrow+1;row<=endrow;row++){
                System.out.print(matrix[row][endcol]+" ");
            }
            //bottom
            for(int col=endcol-1;col>=startcol;col--){
                System.out.print(matrix[endrow][col]+" ");
            }
            //left
            for(int row=endrow-1;row>=startcol+1;row--){
                System.out.print(matrix[row][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }






        
    }
}