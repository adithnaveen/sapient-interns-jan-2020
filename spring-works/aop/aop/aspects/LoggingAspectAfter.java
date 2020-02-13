package aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfter {

	// this method will be executed for both success and failure case 
	@After(value="execution( public double showBalance(..))")
	public void logAfter() {
		System.out.println("Hey i'm in log after");
	}
	
	@AfterReturning(value="execution(public double showBalance(..))")
	public void logAfterReturnSuccessfull() {
		System.out.println("Hey i'm in log after returning ");
		
	}
	
	@AfterThrowing(value="execution(public double showBalance(..))")
	public void logAfterException() {
		System.out.println("Hey i'm in log after exception... ");
		
	}
	
	
}
