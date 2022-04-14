package Memento;
//Memento : 객체의 상태정보를 저장하고 원하는 시점의 이전 상태로 복원할 수 있는 패턴
public class Memento {
   private String state;

   public Memento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }	
}