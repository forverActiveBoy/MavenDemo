package com.yunkan.aop;
import com.yunkan.annotation.LogAnnotation;
import com.yunkan.dao.LogDao;
import com.yunkan.entity.Log;
import com.yunkan.service.LogService;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogAop implements MethodInterceptor {
    @Autowired
    private LogDao logDao;
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //创建一个日志对象
        Log log = new Log();
        //获取到当前执行的方法
        Method method = invocation.getMethod();
        //获取到方法上的注解
        LogAnnotation annotation = method.getAnnotation(LogAnnotation.class);
        //获取到注解值
        String value = annotation.value();
        log.setDoWhat(value);
        log.setOperator("sysadmin");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        log.setTime(df.format(new Date()));
        logDao.insertLog(log);
        // 拦截器中获取Session
       /* HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();*/
        Object proceed = invocation.proceed();
        return proceed;
    }
}
