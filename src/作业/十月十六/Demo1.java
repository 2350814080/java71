package 作业.十月十六;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组的行和列:");
        int m = in.nextInt();               //定义一个数组的行 m
        int n = in.nextInt();               //定义一个数组的列 n
        int[][] arr1 = new int[m][n];      //定义一个数组mxn为arr1
        int[][] arr2 = new int[n][m];      //定义一个数组nxm为arr2 此数组为颠倒后的数组
        System.out.println("请输入数组的元素:");
        //给二维数组赋值
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        //打印一次输入的二维数组
        System.out.println("依次打印输入的二维数组：");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + "   ");
            }
            System.out.println();
        }
        //矩阵行列进行交换
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[j][i] = arr1[i][j];
            }
        }
        //输出交换后的矩阵
        System.out.println("依次输出行列颠倒的二维数组：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
