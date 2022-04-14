package Confirm;

import java.util.Scanner;

public class AccountEx3 {
	//전역 객체
	private static Account2[] accountArray = new Account2[100]; //계좌 100개 저장소
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성, 2.계좌목록, 3.입금, 4.출금, 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				createAccount();	//계좌 생성
			} else if(selectNo == 2) {
				accountList();//계좌목록
			} else if(selectNo == 3) {
				deposit(); //입금처리
			} else if(selectNo == 4) {
				withdraw();//출금처리
			} else if(selectNo == 5){
				run = false;
			}
		}
	}
	private static void createAccount() {	//계좌생성
		//계좌번호, 예금주, 초기 입금액을 입력받아서 Account2의 기본객체를 생성하여 저장
		//빈 저장소를 찾아 기본 객체에 저장된 계좌정보를 Account2의 빈 배열객체에 저장
		System.out.println("-------------------------------");
		System.out.println("------- 계좌 생성하기  --------");
		System.out.println("-------------------------------");
		
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("예금주 : ");
		String owner = scanner.next();
		System.out.println("초기 입금액 : ");
		int balance = scanner.nextInt();

		//지역변수
		/*
		Account2 account = new Account2();
		account.setAno(ano);
		account.setOwner(owner);
		account.setBalance(balance);
		*/
		Account2 account = new Account2(ano, owner, balance);		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("계좌 생성 성공~!");
				break;
			}
		}
	}
	private static void accountList() {	//계좌목록
		//계좌정보가 저장된 Account2의 배열 객체에서 null이 나오기 전까지 반복 출력 
		System.out.println("-------------------------------");
		System.out.println("------- 계좌 목록보기  --------");
		System.out.println("-------------------------------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno()+
				"\t"+accountArray[i].getOwner()+"\t"+
				accountArray[i].getBalance());
			} else {
				break;
			}
		}
	}	
	private static void deposit() {	//입금처리
		//계좌번호와 입금할 금액을 입력받아 Account2의 기본 객체를 만들어 저장
		//Account2의 배열 객체에서 입력한 계좌번호와 일치한 계좌정보를 불러와
		//잔액을 입금액과 합산하여 저장
		System.out.println("-------------------------------");
		System.out.println("------- 입금하기  --------");
		System.out.println("-------------------------------");
		
		String ano = scanner.next();
		int balance = scanner.nextInt();
		Account2 account = findAccount(ano);
		if(account == null) {
			System.out.println("존재하지 않는 계좌이므로 입금되지 못했습니다.");
			return;
		}
		account.setBalance(account.getBalance()+balance);
		System.out.println("의뢰하신 "+balance+"가 입금처리 되었습니다.");
	}	
	private static void withdraw() {	//출금처리
		//계좌번호와 출금할 금액을 입력받아 Account2의 기본 객체를 만들어 저장
		//Account2의 배열 객체에서 입력한 계좌번호와 일치한 계좌정보를 불러와
		//잔액을 입금액과 차감하여 저장
		System.out.println("-------------------------------");
		System.out.println("------- 출금하기  --------");
		System.out.println("-------------------------------");
		
		String ano = scanner.next();
		int balance = scanner.nextInt();
		Account2 account = findAccount(ano);
		if(account == null) {
			System.out.println("존재하지 않는 계좌이므로 출금되지 못했습니다.");
			return;
		}
		account.setBalance(account.getBalance()-balance);
		System.out.println("의뢰하신 "+balance+"가 출금처리 되었습니다.");
	}	
	private static Account2 findAccount(String ano) {
		//Account2의 기본 객체를 만들어 다른 함수에서 전달되어진 검색할 계좌번호를 저장
		//Account2의 배열 객체에서 검색하고자하는 계좌번호의 계좌정보를 찾아서 반환
		Account2 account = null;	//지역변수
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