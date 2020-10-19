package 作业.十月十五;
/*
公司年销售额求和
某公司按照季度和月份统计的数据如下：单位(万元)
第一季度：22,66,44
第二季度：77,33,88
第三季度：25,45,65
第四季度：11,66,99
提示：
1、按照季度列出二维数组；
2、分别对每个一维数组中的元素进行加法运算；
 3、输出运算结果

 */
public class Demo1 {
    public static void main(String[] args) {
        int[][] a = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        System.out.println("数组中的内容为：");
        int sum=0,sum1 = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++){
            int n=0;
            sum1=0;
            for(int j=0;j<a[i].length;j++) {
                sum1+=a[i][j];
                n++;
                sum+=a[i][j];
            }
            System.out.println("第"+(i+1)+"季度为："+sum1);
        }
        System.out.println("这家公司的年收入总和为："+sum);
    }
        /*遍历二维数组并将每一个元素的值加起来
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //拿到每一个一维数组之后，遍历每一个一维数组，加起来
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);*/



       /* int[][] scores = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                System.out.println();
            }
        }*/
    }

