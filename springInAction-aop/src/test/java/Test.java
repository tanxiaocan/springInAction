import com.txc.demo.spring.aop.config.ServiceConfig;
import com.txc.demo.spring.aop.service.IUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tanxiaocan on 2017/12/13.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceConfig.class})
public class Test {


    @Autowired
    private IUserService userService;

    @org.junit.Test
    public void test(){
        userService.addUser();
    }
}
