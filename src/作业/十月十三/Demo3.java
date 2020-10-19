package 作业.十月十三;
//int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3}; 数组去重

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
//利用set的特性
        Set<Integer> set2= new HashSet<Integer>();
        for  ( int  i =  0 ; i < arr11.length; i++) {
            set2.add(arr11[i]);
        }
        System.out.println(set2);
        int [] arr12 =  new  int [set2.size()];
        int  j= 0 ;
        for  (Integer i:set2) {
            arr12[j++]=i;
        }
        System.out.println(Arrays.toString(arr12));
    }

}
