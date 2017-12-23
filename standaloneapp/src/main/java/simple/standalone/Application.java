package simple.standalone;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx =
                SpringApplication.run(Application.class, args);
        assert (ctx != null);
        logger.info("The beans you were looking for:");
        // listing all bean definition    names
        for(String bean : ctx.getBeanDefinitionNames()){
            System.out.println(bean);
        }
        HelloWorld hw = ctx.getBean(HelloWorld.class);
        hw.sayHi();
        System.in.read();
        ctx.close();
    }
}