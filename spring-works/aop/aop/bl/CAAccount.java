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
public class CAAccount {
	private Account account1; 
	
	public Double showBalance() {
		System.out.println("Hi i'm in show balance... ");
		return account1.getBalance(); 
	}
}
