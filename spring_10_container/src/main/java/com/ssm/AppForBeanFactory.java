package com.ssm;


import com.ssm.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by e1hax on 2022-08-25.
 */
public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        BookDao bookDao = beanFactory.getBean("bookDao", BookDao.class);
        bookDao.save();
    }
}