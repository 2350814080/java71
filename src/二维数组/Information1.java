package 二维数组;

import java.util.Scanner;

public class Information1 {
    public static void main(String[] args) {
        int[][] scores = new int[3][5];
        Scanner input = new Scanner(System.in);
        //外层循环 --班（内循环   ---班级的学生）
        for (int i = 0; i < scores.length ; i++) {
            System.out.println("第"+(i+1)+"个班");
            for (int j = 0; j < scores.length; j++) {
                System.out.println("第"+(i+1)+"个班第"+(j+1)+"个同学的成绩");
                scores[i][j] = input.nextInt();
            }
        }
        //完成五个班级的成绩统计
        System.out.println("统计考试成绩");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum +=scores[i][j];
            }
            System.out.println("第"+(i+1)+"个班的同学的总成绩为"+sum);
        }
    }
}
