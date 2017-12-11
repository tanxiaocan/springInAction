import com.txc.springInAction.chap2.service.Instrument;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tanxiaocan on 2017/12/8.
 */
public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Instrument instrument = applicationContext.getBean(Instrument.class);
        instrument.play();
    }
}
