package 一维数组;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        double[] scores = new double[3];
        double avg = 0;
        double sum = 0;
        Scanner input = new Scanner(System.in) ;
        for(int i =0; i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"名同学的JAVA成绩");
            scores[i] = input.nextDouble();
            sum +=scores[i];
        }
        avg = sum/scores.length;
        System.out.println("3个同学JAVA成绩的平均分"+avg);
    }
}


