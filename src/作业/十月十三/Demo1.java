package 作业.十月十三;

import java.util.Arrays;

    /*
    使用Arrays工具类Arrays.sort(数组名)升序排列一组字符
    char[] chars = {'a','c','u','b','e','p','f','z'}，
    并查找某个特殊字符在升序后数组中的位置(下标)。
     */
    public class Demo1 {
        public static void main(String[] args) {
            char[] chars = {'a','c','u','b','e','p','f','z'};//特殊字符为z
            System.out.println("******冒泡排序前******");
            for (char num : chars) {
                System.out.print(num + "\t");
            }
            Arrays.sort(chars);
            System.out.println();
            System.out.println("******冒泡排序后******");
            for (char num : chars) {
                System.out.print(num + "\t");
            }
            int count =0;
            char a = 'z';
            System.out.println();
            System.out.println("特殊字符的下标是：");
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] !=a){
                    count++;
                    continue;
                }
                System.out.print(count);
            }
        }

    }
