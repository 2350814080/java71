package 作业.十月十一;
//使用数组静态初始化方式初始化一个大小为10的整型数组并输出。
public class Demo3 {
    public static void main(String[] args) {
        int scores[] = {11,12,13,14,15,16,17,18,19,20};
        for(int i = 0; i < scores.length;i++){
            System.out.println("第"+(i+1)+"位为"+scores[i]);
        }
    }
}
