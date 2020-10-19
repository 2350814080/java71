package 一维数组;

public class Test4 {
    public static void main(String[] args) {
        int[] nums = {12, 34, 99, 89, 56,};
        System.out.println("*****冒泡排序前*****");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }
        System.out.println();
        System.out.println("*****冒泡排序后*****");
        for (int num : nums) {
            System.out.print(num + "\t");

        }
    }
}
