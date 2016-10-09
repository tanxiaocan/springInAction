import com.txc.springInAction.chap2.service.Performer;
import com.txc.springInAction.chap2.service.impl.*;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by xiaocantan on 2016/10/8.
 */
public class BeanTest {
    @Test
    public void test(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Performer pf = bf.getBean("duke",Performer.class);
        pf.perform();
        Assert.assertNotNull(pf);
    }
    @Test
    public void testPoeticJuggler(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Performer pf = bf.getBean(PoeticJuggler.class);
        pf.perform();
        Assert.assertNotNull(pf);
    }

    @Test
    public void testFactoryMethod(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Stage stage = bf.getBean(Stage.class);
        stage.run();
        Assert.assertNotNull(stage);
    }

    @Test
    public void testSingleton(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Performer pf = (Performer) bf.getBean("duke");
        Performer pf1 = (Performer) bf.getBean("duke1");
        System.out.println(pf);
        System.out.println(pf1);
        Assert.assertEquals(pf,pf1);
    }

    @Test
    public void testInitAndDestory(){
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("annotation.xml"));
        ApplicationContext bf = new ClassPathXmlApplicationContext("annotation.xml");
//        Auditorium auditorium = ac.getBean("auditorium",Auditorium.class);
        Auditorium auditorium = bf.getBean(Auditorium.class);
    }

    @Test
    public void testGetInject(){
        //        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("annotation.xml"));
        ApplicationContext bf = new ClassPathXmlApplicationContext("annotation.xml");
        //        Auditorium auditorium = ac.getBean("auditorium",Auditorium.class);
        Instrumentalist auditorium = bf.getBean(Instrumentalist.class);
        auditorium.perform();
    }

    /*测试java配置*/
    @Test
    public void testJavaConfiguration(){
        ApplicationContext bf = new ClassPathXmlApplicationContext("javaConfig.xml");
        Instrumentalist auditorium = bf.getBean(Instrumentalist.class);
        auditorium.perform();
    }

    /*随便改*/
    @Test
    public void testForEasy(){
        ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
        PoeticJuggler auditorium = bf.getBean(PoeticJuggler.class);
        auditorium.perform();
    }

}
