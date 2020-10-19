package 一维数组;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //int[] list = new int[6];
        int[] list= new int[6];
        list [0] = 99;
        list [1] = 85;
        list [2] = 82;
        list [3] = 63;
        list [4] = 60;

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要插入的学生成绩：");
        int num = input.nextInt();
        //找到num 要插入的位置index  找到num比数组中元素大的位置
        //当用户插入一个负数的时候 int index = ; 就会有问题
        //int index  = 0；
        int index = list.length-1;
        for (int i = 0;  i<list.length ; i++) {
            if(num>list[i]){
                index = i;
                break;
            }
        }
        //原index位置及以后所以的数据要整体的往后移
        for(int i = list.length-1;i>index;i--){
            list[i]= list[i-1];//list[5] = list[4];
        }
        //在index位置将num插入进去
        list[index] =num;
        System.out.println("插入的成绩下标是："+index);
        System.out.println("插入新的成绩最后的成绩是：");
        for(int listnum:list){
            System.out.print(listnum+"\t");
        }
    }
}
