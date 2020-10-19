package 作业.十月十一;
//求出4家店的最低手机价格

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("请输入这四家的价格");
        int scores[] = new int[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {

            System.out.print("请输入第" + (i + 1) + "家的价格");
            scores[i] = input.nextInt();
        }
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (min > scores[i]) {
                min = scores[i];
                System.out.println("最低价格是" + min);
            }
        }

    }
}
