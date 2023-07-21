package org.ai88.chapter01.beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {
    @Test
    public void testShow(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)context.getBean("user");
        user.show();
    }

}
