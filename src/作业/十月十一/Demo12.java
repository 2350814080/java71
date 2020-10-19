package 作业.十月十一;

import java.util.Arrays;
public class Demo12 {
    public static void main(String[] args) {
        //	向一个长度为10的整型数组中随机生成10个0~9的随机整数，求
        //	  1)升序输出
        //	 2)输出总和、平均数
        int sum=0;
        int[]arr=new int[10];
        System.out.println("产生的随机数组为：");
        for(int i=0;i<arr.length;i++) {
            arr[i]=(int)(10*Math.random());//产生10个0～9之间的数依次赋值给数组arr
            System.out.print(arr[i]+" ");//遍历输出
            sum+=arr[i];
        }
        System.out.println(" ");
        int max=arr[0];//将数组的第一个元素定义为max
        System.out.println("数组元素中最大的值为：");
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {//将arr[i]与max比较
                max=arr[i];//若arr[i]大于max，则将arr[i]的值赋值给max
            }
        }
        System.out.println(max);
        Arrays.sort(arr);//升序
        System.out.println("升序后的数组为：");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");//换行
        Arrays.sort(arr);//降序
        System.out.println("降序后的数组为：");
        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");//换行
        System.out.println("这些数的总和为："+sum);
        System.out.println("平均数为："+sum/10.0);
    }
}
