package 一维数组;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] nums = {18, 28, 14, 34, 11};
        System.out.println("******冒泡排序前******");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        Arrays.sort(nums);//升序排列
        System.out.println("******升序排序后******");
        for (int i = 0; i < nums.length; i++) {
        }
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
