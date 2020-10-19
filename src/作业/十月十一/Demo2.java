package 作业.十月十一;
//数组存储5笔购物金额，在控制台输出并计算总金额
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入会员本月消费记录");
        double num = 0;
        double scores[] = new double[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {

            System.out.print("请输入第" + (i + 1) + "笔购物金额");
            scores[i] = input.nextDouble();

            num +=scores[i];

        }
        for (int i = 0; i < scores.length; i++) {


            System.out.println("序号"+"\t"+"\t"+"\t"+"金额(元)");
            System.out.println((i+1)+"\t"+"\t"+"\t"+scores[i]);



        }
        System.out.println("总金额"+"\t"+"\t"+num);
    }
}