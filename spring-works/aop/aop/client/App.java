package aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.service.BankingService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("aop.xml");
		
		BankingService bs = context.getBean("bankingSerivce", BankingService.class); 
		
//		System.out.println(bs.getCaAccount().getAccount1().getAccNo());
//		System.out.println(bs.getCaAccount().getAccount1().getAccHolderName());
//		System.out.println(bs.getCaAccount().getAccount1().getBalance());
		System.out.println(bs.getCaAccount().showBalance());
		
		System.out.println("------------------------------------------------");
		
//		System.out.println(bs.getSbAccount().showBalance(200));
//		bs.getSbAccount().getSomething(100);
		
		
	}
}
