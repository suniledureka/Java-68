package co.edureka;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class Before implements MethodBeforeAdvice
{
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
	  System.out.println("LOG: method name: "+arg0.getName()+" | no of params:"+arg1.length+ " |on "+new Date());			
	} 
}
