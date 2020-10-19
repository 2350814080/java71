package 二维数组;

public class Information {

    public static void main(String[] args) {
        int row = 6;//行数
        int[][] yanghui = new int[row][row];//6行6列数组

        for (int i = 0; i < row; i++){//行
            for(int j = 0;j<= i;j++){//列
                if (j==0 || j==i){
                    yanghui[i][j]=1;

                }else{
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
