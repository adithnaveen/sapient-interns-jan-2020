package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectBefore {
	
//	@Before(value="execution(public double showBalance())")
//	@Before(value="execution(public double aop.bl.CAAccount.showBalance())")
	
//	@Before(value="execution(public  * get*())")
	// to run the aspect for a method prefixed with get and takes 
	// min 1 arg 
//	@Before(value="execution(public  * get*(*))")
	
	
	// will invoke for all the method who take 0 or more 
	@Before(value="execution(public  * get*(..))")
	public void firstBeforeAspect() {
		System.out.println("Hi I'm before aspect for commong get()");
	}

//	@Before(value="execution(public double showBalance())")
//	public void commonForShowBalanceBeforeAspect() {
//		System.out.println("I'm common for all show balances... ");
//	}
	
	
	
	@Before("allGetters()")
	public void firstAspect() {
		System.out.println("First Aspect");
	}

	@Before("allGetters()")
	public void secondAspect() {
		System.out.println("Second Aspect");
	}
	
	
	
	// place hoder method  
	
	@Pointcut(value="execution(public  * get*())")
	public void allGetters() {
		// this will not execute.. 
		System.out.println("********************************************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
