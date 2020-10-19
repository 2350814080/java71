package 一维数组;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int [] list=new int[]{8,4,2,1,23,344,12};
        int sum = 0;
        for(int num :list){
            System.out.println(num);
            num += sum;
            System.out.println("所列数组的和为："+num);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = input.nextInt();
        boolean flag = false;
        for(int num :list){
            if(num ==a){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("数据相同");
        }else{
            System.out.println("数据不同");
        }

    }
}
