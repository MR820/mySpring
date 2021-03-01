package cn.org.wyxxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/1 10:11 上午
 * @email jsjxzw@163.com
 */
public class Main {
  public static void main(String[] args) {
    //    Driver d = new Driver();
    // IOC Inverse of Control 控制反转

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//    Driver d = (Driver) context.getBean("d");
    // DI Dependency Injection 依赖注入
        Tank t = (Tank) context.getBean("tank");
  }
}
