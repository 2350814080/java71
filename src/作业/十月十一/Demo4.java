package 作业.十月十一;
/*
数组查找操作：定义一个长度为10 的一维字符串数组，
在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，
不包含就打印出“No”。
 */

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //创建数组并赋值
        String scores[] = {"int", "double", "float", "byte", "short", "long", "char", "boolean", "length", "width"};

        boolean flag = false;
        System.out.print("请输入一个单词");
        String word = input.next();
        for (int i = 0; i < scores.length; i++) {
            if (word.equals(scores[i])) {
                flag = true;
                break;//找到就跳出

            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }

    }
}