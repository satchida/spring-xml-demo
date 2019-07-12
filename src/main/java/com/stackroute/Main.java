package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //((ClassPathXmlApplicationContext)context).registerShutdownHook();
        //BeanLifecycleDemoBean beanLifecycleDemoBean=context.getBean("Cycle",BeanLifecycleDemoBean.class);

       // BeanPostProcessorDemoBean beanPostProcessorDemoBean=context.getBean("post-processor",BeanPostProcessorDemoBean.class);
    }
}
