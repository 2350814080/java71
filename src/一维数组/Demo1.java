package 一维数组;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int[] list = new int[]{8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        for (int num : list) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("所列所以数组的和为：" + sum);

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int guess = input.nextInt();
        boolean flag = false;
        for (int num : list) {
            if (num == guess) {
                flag = true;
                break;

            }
        }
        if (flag) {
            System.out.println("数据相同");
        } else {
            System.err.println("数据不同");
        }
    }
}

