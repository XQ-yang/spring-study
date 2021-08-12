import com.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 小强
 * @date: 2021/8/11 0011
 * @tool: IntelliJ IDEA
 * @in a word: Be more professional every day!
 */
public class MyTest02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student);
    }


    /*
    * Student{
    * name='yangxiaoqiang',
    * address=Address{address='贵州安顺'},
    * books=[java基础, 高等数学, 数据结构和算法, ssm整合],
    * hobbys=[学习, 看电影, 听歌, 撸代码],
    * card={身份证=34973874326587623487, 学生证=34973874326587623487, 银行卡=34973874326587623487},
    * games=[LOL, csgo, 绝地求生, 王者荣耀],
    * wife='null',
    * info={学号=2386487231642, 性别=男, 专业=软件工程, 年龄=23, 院系=计算机学院}}
    *
    * */
}
