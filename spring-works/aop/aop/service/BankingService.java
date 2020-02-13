package aop.service;

import aop.bl.CAAccount;
import aop.bl.SBAccount;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BankingService {
	private SBAccount sbAccount; 
	private CAAccount caAccount; 
	
}
