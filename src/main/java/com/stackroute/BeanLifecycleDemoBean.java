package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {



    public void destroy() throws Exception {
        System.out.println("Destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties");

    }

    public void customInit(){
        System.out.println("Init Method");
    }

    public void customDestroy(){
        System.out.println("Destroy Method");
    }


}
