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


        System.out.println("ApplicationContext");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie-1",Movie.class);
        movie.act();

        Movie movie2=context.getBean("movie-2",Movie.class);
        movie2.act();

        Movie movie3=context.getBean("movie-3",Movie.class);
        movie3.act();
        //Movie movie1=context.getBean("Wanted",Movie.class);
        //movie1.act();



        /*System.out.println("BeanFactory");
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie2=factory.getBean("Holiday",Movie.class);
        movie2.act();
         */

        //System.out.println("BeanDefinitionRegistry");
        /*BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        xmlBeanDefinitionReader.loadBeanDefinitions(new FileSystemResource("/home/satchida/Desktop/SpringExercise1/src/main/resources/beans.xml"));
        Movie movie3= ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean(Movie.class);
        movie3.act();


        @Deprecated
        BeanDefinitionRegistry factory1 = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory1);
        Movie mv1 =((XmlBeanFactory)factory1).getBean("Holiday",Movie.class);
        mv1.act();

         */


    }
}
