import com.spring.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 小强
 * @date: 2021/8/11 0011
 * @tool: IntelliJ IDEA
 * @in a word: Be more professional every day!
 */
public class MyTest01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        User user = (User) context.getBean("user08");

        System.out.println(user);



    /*
    * 运行结果：
    *
    *       User02被创建了！！
            User{name='yangxiaoqiang', age=20}
    *
    *
    *  没有使用User02，但它也被创建了，所以说在配置文件加载的时候，容器内的对象就已经被创建了
    * */
    }
}
