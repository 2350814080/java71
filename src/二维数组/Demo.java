package 二维数组;

public class Demo {
    public static void main(String[] args) {
        int nums[][] = {{1, 2, 3,}, {4, 5, 6,}, {7, 8, 9,}};
        System.out.println(nums[0]);//对应1，2，3，
        System.out.println(nums[1]);//对应4，5，6，
        System.out.println(nums[2]);//对应7，8，9，
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
        }
        //二维数组如何循环赋值
        int count = 0;
        String[][] names = new String[3][5];
        for (int i = 0; i < names.length; i++) {//外部长度3
            for (int j = 0; j < names[i].length; j++) {//内部长度5
                names[i][j]="a";
            }
        }
        char[][] abc=new char[2][4];
    }
}
