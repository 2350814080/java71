package 作业.十月十三;

import java.util.Arrays;
import java.util.Scanner;

/*
 输入五种水果的英文名称(如葡萄grape，橘子orange，香蕉banana，苹果apple，桃peach)，
 编写一个程序，输出这些水果的名称(按照在字典里出现的先后顺序输出)
 */
public class Demo2 {
    public static void main(String[] args) {
        String[] scores = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入" + (i + 1) + "个水果的英文名字名字");
            scores[i] = input.next();
        }
        Arrays.sort(scores);
        System.out.println("这些水果的英文在字典中出现的顺序是：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]+"\t");
        }
    }
}
