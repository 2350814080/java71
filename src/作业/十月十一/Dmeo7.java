package 作业.十月十一;

import java.util.Scanner;

public class Dmeo7 {
    /**
     * 冒泡排序5名学员成绩（降序）
     * @param args
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入5名同学的成绩：");
        // 首先定义数组长度，数字，
        int[] scores= new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"名同学的成绩：");
            scores[i]=input.nextInt();
        }


        System.out.println("*****冒泡排序前*****");
        for (int num : scores) {
            System.out.println(num);
        }
        //冒泡排序（降序）
        //数字比较轮次
        for (int i = 0; i < scores.length-1; i++) {
            //数字每轮比较次数
            for (int j = 0; j < (scores.length-1)-i; j++) {
                //按照规律比较并交换数字，前面数字比后面数字大就交换
                if (scores[j]<scores[j+1]) {
                    int temp =scores[j];
                    scores[j]=scores[j+1];
                    scores[j+1]=temp;

                }
            }
        }
        System.out.println("*****冒泡排序后*****");
        for (int num : scores) {
            System.out.print(num);
        }
    }
}
