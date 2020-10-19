package 作业.十月十五;

import java.util.Scanner;

//使用二维数组存储班上五个学生三门功课的考试成绩，要求输出每一个学生的总分、平均分、最高分、最低分
public class Demo {
    public static void main(String[] args) {
        int[][] scores = new int[5][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个同学");
            for (int j = 0; j < 3; j++) {
                System.out.println("第" + (i + 1) + "个同学第" + (j + 1) + "门的成绩");
                scores[i][j] = input.nextInt();
            }
        }
        System.out.println("统计考试成绩");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int avg = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                avg = sum / 3;


                }

                System.out.println("第" + (i + 1) + "个同学的总成绩为" + sum + "\t" + "平均分为" + avg + "\t" );

        }
        for(int i=0;i<scores.length;i++){
            int max =scores[i][0];
            for(int j=1;j<scores[i].length;j++){
                if(scores[i][j]>max){
                    max=scores[i][j];
                }
            }
            System.out.println("第" + (i + 1) + "个同学的最高分:"+max);
        }
        for(int i=0;i<scores.length;i++){//scores[0] 
            int min = scores [i][0];
            for(int j=1;j<scores[i].length;j++){//scores[0][0] 
                if(scores[i][j]<min){
                    min = scores[i][j] ;
                }
            }
            System.out.println("第" + (i + 1) + "个同学的最低分:"+min);
        }
    }
}
