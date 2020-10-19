package 一维数组;
//增加
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        String[] names = {"Tome", "Jack", "Sam", "Alice", null, "Ruby", "Robin"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入人员姓名：");
        String name = input.next();
        int j = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                j = i;
                break;
            }
        }
        System.out.println("j=" + j);
        if (j != -1) {
            names[j] = name;
        } else {
            System.out.println("数组已满");
        }
        System.out.println("增加后的人员姓名为");
        for (String item : names) {
            System.out.println(item + "\t");
        }
    }
}