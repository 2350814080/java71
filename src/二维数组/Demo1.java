package 二维数组;

import java.util.Arrays;

public class Demo1 {
    //倒置数组元素
    public static void main(String[] args) {
        int [] arr = {7,1,3,4,5,2};
        int i = 0;//定义第一个数组元素
        int j = arr.length-1;//定义最后一个数组元素
        int temp;
        while (i<j){
            temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
