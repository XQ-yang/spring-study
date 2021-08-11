import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;
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
        //UserService service = new UserServiceImpl();
        //
        //
        //service.getData();


        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("serviceImpl");

        serviceImpl.getData();
    }
}
