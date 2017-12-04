import com.txc.springInAction.chap1.service.Knight;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tanxiaocan on 2017/12/4.
 */
public class BraveKnightTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
