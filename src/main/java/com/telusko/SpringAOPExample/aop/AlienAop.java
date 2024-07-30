package com.telusko.SpringAOPExample.aop;

import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlienAop {
	
//	@Before(value="execution(* com.telusko.SpringAOPExample.restcontroller.*.*(..))") //same as below
	@Before(value="execution(* com.telusko.SpringAOPExample.restcontroller.AlienRestApi.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		
		System.out.println("Request made to "+ joinPoint.getSignature()+ "at " +LocalTime.now());
		
		
	}
	
	
	@After(value="execution(* com.telusko.SpringAOPExample.restcontroller.AlienRestApi.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		
		System.out.println("Request came to "+ joinPoint.getSignature()+ "at " +LocalTime.now());
	
	}
	
	
	@Before(value="execution(* com.telusko.SpringAOPExample.service.AlienService.*(..))")
	   public void beforeAdviceService(JoinPoint joinPoint)
	   {
			System.out.println("Request made to " + joinPoint.getSignature()+" at " + LocalTime.now());
	   }
	
	@After(value="execution(* com.telusko.SpringAOPExample.service.AlienService.*(..))")
	   public void afterAdviceServuce(JoinPoint joinPoint)
	   {
			System.out.println("Response Came from " + joinPoint.getSignature()+" at " + LocalTime.now());
	   }

	@AfterThrowing(value="execution(* com.telusko.SpringAOPExample.service.AlienService.*(..))", throwing="exception")
	   public void afterAdviceService(JoinPoint joinPoint, Exception exception)
	   {
			System.out.println("Response Came from " + joinPoint.getSignature()+" at " + LocalTime.now() +" exception is "+ exception.getMessage());
	   }
	
}
