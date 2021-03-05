package cn.org.wyxxt.aop.v1;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/5 10:32 上午
 * @email jsjxzw@163.com
 */
public class TimeProxy {
    public void before() {
        System.out.println("method start..." + System.currentTimeMillis());
    }

    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }
}
