package 作业.十月十五;

public class Demo2 {
    public static void main(String[] args) {
    int[][] student = new int[3][5];//存储各个同学各科得分 
    String[] subject = {"Java","JSP","CoreJava","MySQL","HTML5"};
    //存储科目 

    //各科得分列表 
 System.out.println("这3位同学的各科得分列表为："); 
 for(int i = 0; i<student.length;i++) {
     for (int j = 0; j < student[i].length; j++) {
            student[i][j] = (int) (Math.random() * 100);//赋值 
            //System.out.print(subject[i]+""); 
            System.out.print(student[i][j] + " ");
        }
        System.out.println();
    }
    //各个同学总分 
    int allScore = 0;
    int[] sum = new int[3]; 
 System.out.print("这3位同学的总分分别为："); 
 for(int i = 0; i<student.length;i++) {
        for (int j = 0; j < student[i].length; j++) {
            allScore += student[i][j];
        }
        if (i % 5 == 0) {
            System.out.println();
        }
        sum[i] = allScore;
        System.out.print(sum[i] + " ");
        allScore = 0;
    }

        System.out.println();
    //求所有学员的某门课程的平均分 
 System.out.println("五门课(core C++，coreJava，Servlet，JSP和EJB)的平均成绩如下所示");
    int[] avg = new int[5];
    int theSum = 0; 
 for(
    int j = 0;
    j<5;j++)

    {
        for (int i = 0; i < student.length; i++) {
            theSum += student[i][j];
        }
        avg[j] = theSum / 3;
        theSum = 0;
        System.out.print(avg[j] + " ");
    }
} 
 
}
