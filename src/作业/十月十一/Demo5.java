package 作业.十月十一;
/*
 获取数组最大值和最小值操作：
利用Java的Math类的random()方法，随机生成10个数，填充一个数组，并找出产生10个随机数中最大的、最小的数。
提示：使用 int num=(int)(100*Math.random());

 */

public class Demo5 {
    public static void main(String[] args) {
        int[]nums= new int[10];
        for (int i=0;i<nums.length;i++){
            nums[i]=((int)(Math.random()*10000))%1001;;
        }
        System.out.println("数组元素：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
        System.out.println();
        int max =nums[0];
        int min =nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>max){
                max =nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        System.out.println("数组元素中最大值为："+max);
        System.out.println("数组元素中最小值为："+min);
    }
}