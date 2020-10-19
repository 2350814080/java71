package 作业.十月十四;

import java.util.Arrays;
import java.util.Scanner;

/*
String[]names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
分别进行查操作。

 */
public class Demo3 {
    public static void main(String[] args) {
        String[] names = {"Angelia", "Alice", "tome", "sam", "Jack", "Ruby", null, "Robin", "Anne"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查找的人员姓名：");
        String name = input.next();
        boolean isfind = false;
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                isfind=true;
            }
        }
        if(isfind){
            System.out.println("已经查找到人员："+name);
        }else{
            System.out.println("很抱歉，没有你要查找的名字");
        }

    }
}

