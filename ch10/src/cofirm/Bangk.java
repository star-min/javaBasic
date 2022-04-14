package cofirm;

import java.util.Scanner;

public class Bangk {
	//전역 객체
	private static Account[] accountArray = new Account[100]; 
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성, 2.계좌목록, 3.입금, 4.출금, 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				createAccount();	
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit(); 
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5){
				run = false;
			}
		}
	}
	private static void createAccount() {
		System.out.println("---------------");
		System.out.println("- 계좌 생성하기  -");
		System.out.println("---------------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		System.out.println("예금주 : ");
		String owner = sc.next();
		System.out.println("초기 입금액 : ");
		int balance = sc.nextInt();
		
		Account account = new Account(ano,owner,balance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("계좌 생성 성공");

	}
	private static void accountList() {
		System.out.println("---------------");
		System.out.println("- 계좌 목록보기  -");
		System.out.println("---------------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAno()+"\t"+
			accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
			}
		}
	}	
	private static void deposit() {	
		System.out.println("-----------");
		System.out.println("- 입금하기  -");
		System.out.println("-----------");
		
		System.out.println("입급할 계좌 입력");
		String ano = sc.next();
		System.out.println("입급할 금액 입력");
		int balance = sc.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		account.setBalance(account.getBalance()+balance);
		System.out.println(balance+"가 입금처리 되었습니다.");
		
	}	
	private static void withdraw() {	
		System.out.println("-----------");
		System.out.println("- 출금하기  -");
		System.out.println("-----------");
		
		System.out.println("출금할 계좌 입력");
		String ano = sc.next();
		System.out.println("출금할 금액 입력");
		int balance = sc.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("존재하지 않는 계좌입니다.");
			return;
		}
		account.setBalance(account.getBalance()-balance);
		System.out.println(balance+"가 출금처리 되었습니다.");

	}	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;

	}
}