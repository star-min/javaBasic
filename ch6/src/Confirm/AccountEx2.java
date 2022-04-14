package Confirm;

import java.util.Scanner;

public class AccountEx2 {
    private static Account2[] accountArray = new Account2[100];
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 |3. 입금 | 4. 출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
 
            int selectNo = scanner.nextInt();
 
            if(selectNo == 1) {
                createAccount();
            } else if(selectNo == 2) {
                accountList();
            } else if(selectNo == 3) {
                deposit();
            } else if(selectNo == 4) {
                withdraw();
            } else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
 
    //계좌생성하기
    private static void createAccount() {
    	System.out.println("***************");
    	System.out.println("*** 계좌 생성 ***");
    	System.out.println("***************");
    	
    	System.out.println("계좌번호 : ");
    	String ano = scanner.next();
    	System.out.println("예금주 : ");
    	String owner = scanner.next();
    	System.out.println("초기 입금액 : ");
    	int balance = scanner.nextInt();
    	Account2 account = new Account2(ano, owner, balance);
    	for(int i=0;i<accountArray.length; i++) {
    		if(accountArray[i] == null) {	//새로운 비어있는 기억장소를 찾아 계좌를 생성
    			accountArray[i] = account;
    			System.out.println("계좌생성 성공~!");
    			break;
    		}
    	}    	
    }
 
    //계좌목록보기
    private static void accountList() {
    	System.out.println("***************");
    	System.out.println("*** 계좌 목록 ***");
    	System.out.println("***************");
    	
    	for(int i=0;i<accountArray.length;i++) {
    		if(accountArray[i] != null) {
    			System.out.println(accountArray[i].getAno()+"\t"+
    			accountArray[i].getOwner()+"\t"+
    			accountArray[i].getBalance());
    		} else {
    			break;
    		}
    	}
    }
 
    //예금하기
    private static void deposit() {
    	System.out.println("***************");
    	System.out.println("*** 입금 하기 ***");
    	System.out.println("***************");
    	
    	System.out.println("계좌 번호 : ");
    	String ano = scanner.next();
    	
    	System.out.println("입금액 : ");
    	int balance = scanner.nextInt();
    	
    	Account2 account = findAccount(ano);   	
    	if(account == null) {
    		System.out.println("해당 계좌가 존재하지 않습니다.");
    		return;
    	}   	
    	account.setBalance(account.getBalance() + balance);
    	System.out.println("입금처리가 성공적으로 완료되었습니다.");
    }
 
    //출금하기
    private static void withdraw() {
    	System.out.println("***************");
    	System.out.println("*** 출금 하기 ***");
    	System.out.println("***************");
    	
    	System.out.println("계좌 번호 : ");
    	String ano = scanner.next();
    	System.out.println("출금액 : ");
    	int balance = scanner.nextInt();    	
    	Account2 account = findAccount(ano);   	
    	if(account == null) {
    		System.out.println("해당 계좌가 존재하지 않습니다.");
    		return;
    	}   	
    	account.setBalance(account.getBalance() - balance);
    	System.out.println("출금처리가 성공적으로 완료되었습니다.");
    }
 
    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account2 findAccount(String ano) {
    	Account2 account = null;
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