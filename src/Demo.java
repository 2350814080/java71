import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String[] names ={"a","b","c","d"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要增加的名字：");
        String name = input.next();
        int j = -1;
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                j=i;
                break;
            }
        }
        System.out.println("j=" + j);
        if (j != -1) {
            names[j] = name;
        } else {
            System.out.println("数组已满");
        }
        System.out.println("增加后的人员姓名为");
        for (String item : names) {
            System.out.print(item + "\t");
        }
    }
}

