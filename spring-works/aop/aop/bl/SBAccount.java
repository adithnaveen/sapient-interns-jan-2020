package aop.bl;

import aop.model.Account;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SBAccount {
	private Account account; 
	
	public Double showBalance(int val) {
		if(val < 100) {
			throw new RuntimeException("Please enter more than 100"); 
		}
		return account.getBalance(); 
	}
	
	public void getSomething(int val) {
		System.out.println("Hi i'm in SB Acount Got Value for Debie : " + val);
	}
}
