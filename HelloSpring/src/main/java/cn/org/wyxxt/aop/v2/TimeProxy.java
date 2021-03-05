package cn.org.wyxxt.aop.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/5 10:32 上午
 * @email jsjxzw@163.com
 */
@Aspect
public class TimeProxy {
    @Before("execution (void cn.org.wyxxt.aop.v2.Tank.move())")
    public void before() {
        System.out.println("method start..." + System.currentTimeMillis());
    }

    @After("execution (void cn.org.wyxxt.aop.v2.Tank.move())")
    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }
}
