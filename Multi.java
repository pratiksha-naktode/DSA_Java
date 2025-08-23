public class Multi{
    public static void main(String args[]){
        int matrix1[][]={{1,2,3},{6,7,8},{6,7,8}};
        int matrix2[][]={{1,1,1},{2,2,2},{3,3,3}};
        int m=matrix1[0].length;
        int n=matrix2.length;
        int sum=0;
        int matrix3[][]=new int[n][matrix2[0].length];

        if(m==n){
            for(int row=0;row<=n-1;row++){
                for(int col=0;col<=m-1;col++){
                        sum+=matrix1[row][col]*matrix2[row][col];
                }
            }
           
        }
        System.out.println("Addtion "+sum);
    }
}