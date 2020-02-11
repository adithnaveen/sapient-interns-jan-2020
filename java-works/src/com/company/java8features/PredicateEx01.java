package com.company.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class Account{
	private int accId; 
	private double balance;  
	private String custName; 
	private String sex; 
}

public class PredicateEx01 {
	public static void main(String[] args) {
		
		List<Account> accountList = Arrays.asList(
				new Account(101, 2323, "Saahil", "Male"), 
				new Account(23, 2233, "Zubin", "Male"), 
				new Account(56, 3322, "Mayank", "Male"), 
				new Account(12, 4455, "Preethi", "Female"), 
				new Account(87, 5566, "Srinidhi", "Female"), 
				new Account(78, 8787, "Siddhanth", "Male"), 
				new Account(98, 5678, "Kareek", "Male"), 
				new Account(100, 6611, "Sanjana", "Female") 
				);
		
		
		// filter for only Males 
		List<Account> onlyMales = 
				AccountPredicate.filterAccounts
					(accountList, AccountPredicate.onlyMale());
		
		
		onlyMales.forEach(System.out :: println);
		
		// list all people who has balance more than 4500 
		List<Account> conditionalValueCheck = 
				AccountPredicate.filterAccounts
				(accountList, AccountPredicate.onBalanceCheck(4500));
		
		
		conditionalValueCheck.forEach(System.out :: println);
		
		
		System.out.println("----------------male & condition----------------------------");
		
		Predicate<Account> onlyMaleAndConditionCheck =
				AccountPredicate.onlyMale().and(AccountPredicate.onBalanceCheck(4500)); 
		
		
		List<Account> onlyMaleAndConditionCheckList = 
				AccountPredicate.filterAccounts
				(accountList,onlyMaleAndConditionCheck);
		
		
		onlyMaleAndConditionCheckList.forEach(System.out :: println);
	}
	
	
	static class AccountPredicate{
		// list all the predicates needed 
		
		public static Predicate<Account> onlyMale(){
			return p-> p.getSex().equals("Male"); 
		}
		
		public static Predicate<Account> onBalanceCheck(double balance){
			return p-> p.getBalance() > balance; 
		}
		
		// filter method and return list 
		public static List<Account> filterAccounts (List<Account> accountList, 
					Predicate<Account> accountPredicate){
			
			return accountList
						.stream()
						.filter(accountPredicate)
						.collect(Collectors.toList());
			
			
			
		}
	}
	
	
}



















