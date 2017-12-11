import com.txc.springInAction.chap2.config.BeanConfig;
import com.txc.springInAction.chap2.service.Instrument;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

/**
 * Created by tanxiaocan on 2017/12/8.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
public class DITest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private Instrument instrument;

    @Test
    public void instrumentNotNull(){
        instrument.play();
        assertEquals("aaa",log.getLog());
    }
}
