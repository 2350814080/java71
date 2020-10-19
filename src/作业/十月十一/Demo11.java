package 作业.十月十一;
//定义一个数组int[] nums={8,7,3,9,5,4,1}
//输出数组中的最大值和最大值所在的下标
public class Demo11 {
    public static void main(String[] args) {
        int[] nums = {8,7,3,9,5,4,1};
        int max = nums[0];
        int a  =-1;
        for(int i=0;i< nums.length; i++){
            if(max<nums[i]){
                max=nums[i];
                a = i;
            }
        }
        System.out.println("最大值为："+max+"\n"+"最大值所在下标为："+a);
    }
}
