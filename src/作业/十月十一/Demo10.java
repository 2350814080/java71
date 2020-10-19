package 作业.十月十一;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        System.out.println("请输入五位学员成绩：");
        int nums[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第" + (i + 1) + "名同学的成绩");
            nums[i] = input.nextInt();

        }
        System.out.println("*****冒泡排序前*****");
        for (int num : nums) {
            System.out.print(num+"\t");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("********冒泡排序之后********");
        for (int num : nums) {
            System.out.print(num+"\t");
        }
    }
}