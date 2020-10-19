package 一维数组;

import java.util.Scanner;

public class Demo2 {
    //从键盘输入本次JAVA考试五位学生的成绩，求考试的最高分
    public static void main(String[] args) {
        int[] scores = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i =0; i< scores.length;i++){
            System.out.println("请输入第"+(i+1)+"名同学的JAVA成绩");
            scores[i] = input.nextInt();//动态根据数组下标获取键盘输入的内容

        }
        //求最高分
        int max =scores[0];
        int min = scores[0];
        for(int i =0; i< scores.length;i++){
            if(scores[i]>max){
                max = scores[i];
            }
            if(scores[i]<min){
                min = scores[i];
            }
        }
        System.out.println("本次JAVA考试五位学生成绩最高分："+max);
        System.out.println("本次JAVA考试五位学生成绩最底分："+min);
    }
}
