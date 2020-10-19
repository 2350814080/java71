package com.company;
public class Main{
    public static void main(String[ ] args){
        int [ ] scores= {32,45,67,15,89};  //声明数组并赋值
        for(int i=0;i<scores.length-1;i++){
            for(int j =0; j<scores.length-1-i;j++){
                if(scores[j]>scores[j+1]){  //比较前后大小
                    int temp = scores[j];
                    scores[j] = scores[j+1];   //将小的放前面
                    scores[j+1] = temp;   //将大的放后面
                }
            }
        }
        System.out.println();
        System.out.println("----冒泡排序后----");
        for(int num : scores){
            System.out.print(num+"\t");  //按顺序输出
        }
    }
}

