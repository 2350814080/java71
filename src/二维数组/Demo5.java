package 二维数组;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args){
        //键盘录入
        Scanner input = new Scanner(System.in);
        //提示并接收
        System.out.println("请您输入杨辉三角行数:");
        int n = input.nextInt();
        //定义一个二维数组存放它的行数和列数
        int[][] arr = new int[n][n];

        //第一列和最后一列全是1,即，我们可以固定了
        for(int x=0;x<n;x++){
            arr[x][0]=1;
            arr[x][x]=1;
        }

        //从第三行开始
        for(int x=2;x<arr.length;x++){
            //从第二列开始
            for(int y=1;y<=x-1;y++){//从第二列开始，再减去它的最后一列
                arr[x][y] = arr[x-1][y-1] +arr[x-1][y];
            }
        }

        //输出
        for(int x=0;x<arr.length;x++){//外层循环次数，即为数组长度-1
            for(int y=0;y<=x;y++){
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println();
        }
    }
}
