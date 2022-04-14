package Mediator;
//Mediator : 객체들 간의 상호작용 행위를 캡슐화하여 관리하는 패턴
import java.util.ArrayList;
import java.util.List;

public class Mediator{ 
	List<IDestination> list = new ArrayList<IDestination>(); 
	public void addDestination(IDestination destination){ 
		list.add(destination); 
	} 
	public void onEvent(String from, String event){ 
		for(IDestination each : list){ // 이벤트의 전송 
			each.receiveEvent(from, event);
		}
	}
}