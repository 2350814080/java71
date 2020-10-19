package 作业.十月十四;
/*
String[]names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
分别进行改操作。

 */
import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String[] names = {"Angelia", "Alice", "tome", "sam", "Jack", "Ruby", null, "Robin", "Anne"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要更改的人员姓名：");
        String name = input.next();
        int j = -1;
        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                names[i] = null;
                System.out.println("请输入更改之后的名字为：");
                String a = input.next();
                names[i] = a;
            }
        }

        System.out.println("j=" + j);
        if (j != -1) {
            for (int i = j; i < names.length-1; i++) {
                names[i] = names[i+1];
            }
            System.out.println(Arrays.toString(names));
            names[names.length-1] = null;
        } else {
            System.out.println("很抱歉，没有你要更改的名字");
        }
        System.out.println("更改后的人员姓名为");
        for (String item : names) {
            System.out.println(item + "\t");
        }
    }
}
