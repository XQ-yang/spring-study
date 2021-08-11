import com.spring.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 小强
 * @date: 2021/8/11 0011
 * @tool: IntelliJ IDEA
 * @in a word: Be more professional every day!
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");

        System.out.println(hello);

    }
}
