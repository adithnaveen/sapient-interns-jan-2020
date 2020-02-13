package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {

	
	@Around(value="execution(public Double showBalance())")
	public Object sampleAroundAspect(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object object = null;
		try {
			System.out.println("Before method called in @Around");
			object = proceedingJoinPoint.proceed();
			System.out.println("After method called in @Around");
		}catch(Throwable e) {
			e.printStackTrace(); 
		}
		System.out.println("Object got is " + object);
	
		return object; 
	}
	
	
}
